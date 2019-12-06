package com.marlboro.controller;

import com.marlboro.service.DubboConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by tdw on 2019/12/6.
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private DubboConsumerService service;

    @PostMapping("/save")
    public Object saveUser(){
        return service.saveUser();
    }
}
