package com.maven.controller.validation;

/**
 * Created by 黎裕聪 on 2017/8/1.
 */
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.maven.mapper.UserMapper;
import com.maven.po.UserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import com.maven.controller.validation.common.Config;
import com.maven.controller.validation.common.HttpUtil;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import com.maven.service.UserService;
import com.maven.po.UserCustom;
import com.maven.po.User;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import com.sun.mail.util.MailSSLSocketFactory;
import java.util.Properties;
@Controller
@RequestMapping("/validateuser")
public class ValidateUser {
    @Autowired
    private UserMapper userMapper;
    @RequestMapping("/doUserName")
    public void validateUsername(
            Model model,
            HttpServletRequest request,
            HttpServletResponse response,
            @ModelAttribute("user") @Validated(value = {ValidGroup1.class}) User user,
            BindingResult bindingResult)throws Exception{
        UserExample userExample=new UserExample();
        UserExample.Criteria criteria=userExample.createCriteria();
        criteria.andUsernameEqualTo(user.getUsername());
        String result=String.valueOf(userMapper.countByExample(userExample));
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().print(result);

    }

    @RequestMapping("/doEmail")
    public void validateEmail(
            Model model,
            HttpServletRequest request,
            HttpServletResponse response,
            @ModelAttribute("user") @Validated(value = {ValidGroup1.class}) User user,
            BindingResult bindingResult)throws Exception{
        UserExample userExample=new UserExample();
        UserExample.Criteria criteria=userExample.createCriteria();
        criteria.andEmailEqualTo(user.getEmail());

        String result=String.valueOf(userMapper.countByExample(userExample));

        response.getWriter().print(result);

    }
    @RequestMapping("/getEmail")
    public void setUserEmail(
            @ModelAttribute("user") @Validated(value = {ValidGroup1.class}) User user,
            HttpServletResponse response
    ) throws Exception{
        try {
            Properties prop = new Properties();
            prop.setProperty("mail.debug", "true");
            prop.setProperty("mail.host", "smtp.qq.com");
            prop.setProperty("mail.smtp.auth", "true");
            prop.setProperty("mail.transport.protocol", "smtp");
            MailSSLSocketFactory sf = new MailSSLSocketFactory();
            sf.setTrustAllHosts(true);
            prop.put("mail.smtp.ssl.enable", "true");
            prop.put("mail.smtp.ssl.socketFactory", sf);
            Session session = Session.getInstance(prop);
            Transport ts = session.getTransport();
            ts.connect("smtp.qq.com", "872193459", "syymguoeigvpbcgi");
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress("872193459@qq.com"));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(user.getEmail()));
            message.setSubject("【奥德科技】您的验证码为845623，请于1分钟内正确输入，如非本人操作，请忽略此短信。");
            message.setContent("Concent", "text/html;charset=UTF-8");
            Message message1 = (Message) message;
            ts.sendMessage(message1, message1.getAllRecipients());
            ts.close();
            String result=user.getEmail();
            response.setCharacterEncoding("UTF-8");
            response.setContentType("text/html;charset=UTF-8");
            response.getWriter().print(result);

        }catch (Exception e){
            String result="此邮箱不存在";
            response.setCharacterEncoding("UTF-8");
            response.setContentType("text/html;charset=UTF-8");
            response.getWriter().print(result);

        }

    }
    @RequestMapping("/getPhone")
    public void setUserPhone(
            @ModelAttribute("user") @Validated(value = {ValidGroup1.class}) User user,
            HttpServletResponse response
    )throws Exception{

            String operation = "/industrySMS/sendSMS";
            String accountSid = Config.ACCOUNT_SID;
            String to = user.getPhone();
            String smsContent = "【奥德科技】您的验证码为845623，请于1分钟内正确输入，如非本人操作，请忽略此短信。";
            String url = Config.BASE_URL + operation;
            String body = "accountSid=" + accountSid + "&to=" + to + "&smsContent=" + smsContent
                    + HttpUtil.createCommonParam();

            // 提交请求
            String result = HttpUtil.post(url, body);
            System.out.println("result:" + System.lineSeparator() + result);
            if (result.contains("请求成功")){
                String result1=user.getPhone();
                response.setCharacterEncoding("UTF-8");
                response.setContentType("text/html;charset=UTF-8");
                response.getWriter().print(result1);
            }else {
                String result1="发送发生错误";
                response.setCharacterEncoding("UTF-8");
                response.setContentType("text/html;charset=UTF-8");
                response.getWriter().print(result1);
            }
    }

}
