package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.demo.config.MainConfig;

public class BeanComponentScanConfigTest {

    public static void main(String[] args){

        ApplicationContext ctx = new AnnotationConfigApplicationContext(MainConfig.class);
        System.out.println("Bean Definition Names :");
        String[] names = ctx.getBeanDefinitionNames();
        for(String name:names){
            System.out.println(name);
        }

    }
}

