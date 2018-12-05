package com.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.demo.bean.Person;

@Configuration
// Spring配置类 = spring配置文件
public class PersonConfig {

    @Bean("personBeanId")
    // @Bean(value="pId")
    //@Bean 给Spring容器注册一个 Person 类型的bean
    // 默认以方法名称为 bean id
    public Person person() {
        return new Person("Lisi", 20);
    }

}
