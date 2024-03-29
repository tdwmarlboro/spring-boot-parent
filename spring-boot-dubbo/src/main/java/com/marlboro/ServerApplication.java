package com.marlboro;

import org.apache.dubbo.config.spring.context.annotation.EnableDubboConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by tdw on 2019/12/5.
 */
@SpringBootApplication
//@EnableDubboConfig
//@ComponentScan("com.marlboro.service.impl")
@ImportResource(value = {"classpath:dubbo-config.xml"})
public class ServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServerApplication.class,args);
    }
}
