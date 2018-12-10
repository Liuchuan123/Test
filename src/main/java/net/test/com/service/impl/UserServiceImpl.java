package net.test.com.service.impl;

import net.test.com.dao.UserMapper;
import net.test.com.pojo.User;
import net.test.com.pojo.UserExample;
import net.test.com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: springMvcDemo
 * @description: 实现类
 * @author: Mr.Liu
 * @create: 2018-12-06 18:45
 **/
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> findAll() {
        UserExample example = new UserExample();
        example.setOrderByClause("id desc");
        return userMapper.selectByExample(example);
    }
}