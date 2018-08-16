package com.ws.service;

import com.ws.dao.UserMapper;
import com.ws.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User getById(String id) throws Exception {
        return userMapper.getById(id);
    }

    @Override
    public void insert(User user) throws Exception {
        userMapper.insert(user);
    }

    @Override
    public void update(User user) throws Exception {
        userMapper.update(user);
    }

    @Override
    public void delete(String id) throws Exception {
        userMapper.delete(id);
    }
}
