package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.demo.config.Config;
import com.demo.model.animal.Bird;
import com.demo.model.animal.Dog;

public class LazyLoadConfigTest {

    public static void main(String[] args){

        ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);

        System.out.println("Spring 容器初始化完成");

        Dog dog = ctx.getBean("dog", Dog.class);
        Bird bird = ctx.getBean("bird", Bird.class);

    }

}
