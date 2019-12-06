package com.marlboro;

import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.apache.dubbo.config.spring.context.annotation.EnableDubboConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by tdw on 2019/12/6.
 */
@SpringBootApplication
//@EnableDubboConfig
//@DubboComponentScan("com.marlboro.service")
@ImportResource(value = {"classpath:spring-dubbo-consumer.xml"})
public class ConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class,args);
    }
}
