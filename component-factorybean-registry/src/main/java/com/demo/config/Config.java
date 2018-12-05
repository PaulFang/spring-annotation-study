package com.demo.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.demo.factory.RobotComponentFactoryBean;
import com.demo.factory.RobotFactoryBean;

@Configuration
@ComponentScan(basePackages = {"com.demo"})
public class Config {

    // 注意： 配置的是 FactoryBean
    @Bean
    public RobotFactoryBean robotFactoryBean(){
        return new RobotFactoryBean();
    }

    // 注意： 配置的是 FactoryBean
    @Bean
    public RobotComponentFactoryBean robotComponentFactoryBean(){
        return new RobotComponentFactoryBean();
    }

}
