package com.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.demo.model.Animal;
import com.demo.model.Person;

@Configuration
// Spring配置类 = spring配置文件
public class Config {

    @Bean
    @Scope("prototype")
    // 当 Scope 为 prototype 时，每次从容器中获取一个新的 bean 对象
    // 当 Scope 为 singleton 时，容器在初始化时完成 bean 对应的创建，容器中仅仅有一个此bean实例
    public Person person() {
        return new Person("Lisi", 20);
    }

    @Bean
    @Scope("singleton")
    public Animal animal(){
        return new Animal("tiger");
    }


}
