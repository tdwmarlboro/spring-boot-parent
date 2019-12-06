package com.marlboro.service;

import com.marlboro.domain.User;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by tdw on 2019/12/6.
 */
@Service
public class DubboConsumerService {

    @Reference
    UserService userService;

    public User saveUser(){
        User user = new User();
        user.setUserName("marlboro");
        user.setPassword("123456");
        return userService.saveUser(user);
    }
}
