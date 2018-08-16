package com.ws.controller;

import com.ws.po.User;
import com.ws.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/users/{id}")
    public User getById(@PathVariable String id) throws Exception {
        return userService.getById(id);
    }

    @PostMapping("/users")
    public String insert(User user) throws Exception {
        userService.insert(user);
        return "添加成功：" + user.toString();
    }

    @PutMapping("/users")
    public String update(User user) throws Exception {
        userService.update(user);
        return "修改成功：" + user.toString();
    }

    @DeleteMapping("/users/{id}")
    public String delete(@PathVariable String id) throws Exception {
        userService.delete(id);
        return "删除成功" + id;
    }
}
