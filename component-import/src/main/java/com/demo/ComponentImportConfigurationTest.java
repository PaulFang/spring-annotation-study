package com.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.demo.config.Config;

public class ComponentImportConfigurationTest {

    public static void main(String[] args){
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
        String[] names = ctx.getBeanDefinitionNames();
        for(String name:names){
            System.out.println(name);
        }

    }

}
