package com.marlboro.service.impl;

import com.marlboro.domain.User;
import com.marlboro.service.UserService;
import org.springframework.stereotype.Service;

/**
 * Created by tdw on 2019/12/5.
 */
//@Service
public class UserServiceImpl implements UserService {

    @Override
    public User saveUser(User user) {
        user.setId(1);
        System.out.println(user.toString());
        return user;
    }
}
