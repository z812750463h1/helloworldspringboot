package com.atguigu.springboot.helloworldspringboot.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
@SpringBootApplication
public class SpringbootDemo02Application {
    public static void main(String[] args) {
        ConfigurableApplicationContext sa = SpringApplication.run(SpringbootDemo02Application.class, args);
        for (String beanDefinitionName : sa.getBeanDefinitionNames()) {
            System.out.println(beanDefinitionName);
        }
    }
}
