package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.controller.PersonController;

public class XmlComponentScanConfigTest {

    public static void main(String[] args){

        // 仅仅通过xml 配置加载，没有通过配置类的配置来加载
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        PersonController personController = ctx.getBean("personController", PersonController.class);
        System.out.println(personController);
        System.out.println("\n\nBean Definition Names :");
        String[] names = ctx.getBeanDefinitionNames();
        for(String name:names){
            System.out.println(name);
        }
    }

}
