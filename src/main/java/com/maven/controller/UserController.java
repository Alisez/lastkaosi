package com.maven.controller;

/**
 * Created by 黎裕聪 on 2017/7/29.
 */
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.maven.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import com.maven.service.UserService;
import com.maven.po.UserCustom;
import com.maven.controller.validation.ValidGroup1;
import javax.servlet.http.HttpServletResponse;
import com.maven.po.UserExample;
import com.maven.po.User;
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserService userService;

    @RequestMapping("/register2")
    public String register2(
            Model model,
            HttpServletRequest request,
            Integer id,
            @ModelAttribute("user") @Validated(value = {ValidGroup1.class}) UserCustom userCustom,
            BindingResult bindingResult,
            MultipartFile user_pic//接收图片
    ) throws Exception {
        userMapper.insert(userCustom);
        if (bindingResult.hasErrors()) {
            // 输出错误信息
            List<ObjectError> allErrors = bindingResult.getAllErrors();

            for (ObjectError objectError : allErrors) {
                // 输出错误信息
                System.out.println(objectError.getDefaultMessage());

            }
            // 将错误信息传到页面
            model.addAttribute("allErrors", allErrors);


            //可以直接使用model将提交pojo回显到页面
            model.addAttribute("user", userCustom);

            // 出错重新到商品修改页面
            return "user/editUser";
        }
        String originalFilename = user_pic.getOriginalFilename();

        if (user_pic != null && originalFilename != null && originalFilename.length() > 0) {
            //存储图片的物理路径
            String pic_path = "F:\\develop\\upload\\temp\\";


            //新的图片名称
            String newFileName = UUID.randomUUID() + originalFilename.substring(originalFilename.lastIndexOf("."));
            //新图片
            File newFile = new File(pic_path + newFileName);
            user_pic.transferTo(newFile);
            userCustom.setPicture(newFileName);
        }

        return "sussess";





    }
    @RequestMapping("/register")
    public String register(
            Model model,
            HttpServletRequest request,
            @ModelAttribute("user") @Validated(value = {ValidGroup1.class}) UserCustom userCustom,
            BindingResult bindingResult)throws Exception{
       userService.register(userCustom);
        return "user/login";

    }

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
        String result=null;
        if (userMapper.countByExample(userExample)>=1){
            result="<font color='red'>该用户已经被使用</font>";
        }else{
            result="<font color='red'>该用户可以使用</font>";
        }
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().print(result);

    }





}
