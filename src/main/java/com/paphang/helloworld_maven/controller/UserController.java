package com.paphang.helloworld_maven.controller;

import com.paphang.helloworld_maven.entity.User;
import com.paphang.helloworld_maven.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;
    @GetMapping("/user")
    public String query() {
        List<User> list =  userMapper.selectList(null);
        System.out.println(list);
        return "根据ID获取用户";
    }

    @PostMapping("/user")
    public String save(User user) {
        int i = userMapper.insert(user);
        if (i > 0) {
            return "插入成功";
        } else {
            return "插入失败";
        }
    }

    @PutMapping("/user/")
    public String update(User user) {
        return "更新用户";
    }

    @DeleteMapping("/user/")
    public String deleteById() {
        System.out.println("");
        return "根据id删除用户";
    }
}
