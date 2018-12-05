package com.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.demo.config.Config;


public class ComponentFactoryBeanTest {

    public static void main(String[] args){
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(
            Config.class);
        Object obj1 = ctx.getBean("robotFactoryBean");
        System.out.println(obj1.getClass());
        Object obj2 = ctx.getBean("&robotFactoryBean");
        System.out.println(obj2.getClass());

        System.out.println("----------------------------------------");

        Object object1 = ctx.getBean("robotComponentFactoryBean");
        Object object2 = ctx.getBean("robotComponentFactoryBean");
        System.out.println(object1.getClass() + " " + object1);
        System.out.println(object2.getClass() + " " + object2);
        System.out.println(object1 == object2);
    }

}

