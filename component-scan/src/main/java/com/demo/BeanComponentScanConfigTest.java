package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.demo.config.MainConfig;

public class BeanComponentScanConfigTest {

    public static void main(String[] args){
        // 仅仅通过类配置加载，没有通过xml 加载
        ApplicationContext ctx = new AnnotationConfigApplicationContext(MainConfig.class);
        System.out.println("Bean Definition Names :");
        String[] names = ctx.getBeanDefinitionNames();
        for(String name:names){
            System.out.println(name);
        }

    }
}

