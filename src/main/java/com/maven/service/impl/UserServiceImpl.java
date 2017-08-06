package com.maven.service.impl;

/**
 * Created by 黎裕聪 on 2017/7/29.
 */
import java.util.List;

import com.maven.po.UserCustom;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import com.maven.mapper.UserMapper;
import com.maven.po.User;
import com.maven.po.UserExample;
import com.maven.service.UserService;
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper userMapper;
    @Override
    public void register(UserCustom userCustom) throws Exception{
         userMapper.insert(userCustom);
    }


}
