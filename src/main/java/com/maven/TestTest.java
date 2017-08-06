package com.maven;

import com.maven.po.UserExample;
import org.junit.Before;

import static org.junit.Assert.*;
import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.maven.po.User;

import com.maven.mapper.UserMapper;

/**
 * Created by 黎裕聪 on 2017/7/30.
 */
public class TestTest {
    private ApplicationContext applicationContext;

    private UserMapper userMapper;

    //在setUp这个方法得到spring容器
    @Before
    public void setUp() throws Exception {
        applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-*.xml");
        userMapper = (UserMapper) applicationContext.getBean("userMapper");
    }

    //根据主键删除
    @Test
    public void testDeleteByPrimaryKey() {
        UserExample userExample=new UserExample();
        UserExample.Criteria criteria=userExample.createCriteria();
        criteria.andUsernameEqualTo("机");

        int i=userMapper.countByExample(userExample);
        System.out.print(i);
    }

    //插入



}