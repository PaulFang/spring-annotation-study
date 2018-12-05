package com.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import com.demo.model.animal.Bird;
import com.demo.model.animal.Dog;

@Configuration
public class Config {

    @Bean
    // 未添加@Lazy 注解，即默认非延迟加载该 singleton  bean, Spring 容器启动时即已完成bean初始化
    public Dog dog(){
        return new Dog();
    }

    @Bean
    @Lazy
    // 添加@Lazy 注解后，仅仅在从 Spring 容器中获取 bean 的时候才创建该 bean
    public Bird bird(){
        return new Bird();
    }


}
