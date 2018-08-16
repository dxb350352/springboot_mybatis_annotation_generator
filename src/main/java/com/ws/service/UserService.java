package com.ws.service;

import com.ws.po.User;

public interface UserService {
    User getById(String id) throws Exception;

    void insert(User user) throws Exception;

    void update(User user) throws Exception;

    void delete(String id) throws Exception;
}
