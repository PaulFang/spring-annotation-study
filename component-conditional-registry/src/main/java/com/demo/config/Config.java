package com.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

import com.demo.condition.LinuxCondition;
import com.demo.condition.WindowsCondition;
import com.demo.model.Person;

@Configuration
public class Config{

    @Bean
    @Conditional(LinuxCondition.class)
    public Person personLinux(){
        return new Person("Linux");
    }

    @Bean
    @Conditional(WindowsCondition.class)
    public Person personWindows(){
        return new Person("Windows");
    }

}
