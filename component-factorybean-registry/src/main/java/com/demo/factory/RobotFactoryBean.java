package com.demo.factory;

import org.springframework.beans.factory.FactoryBean;

import com.demo.model.Robot;

public class RobotFactoryBean implements FactoryBean<Robot> {

    public Robot getObject() throws Exception {
        return new Robot();
    }

    public Class<?> getObjectType() {
        return Robot.class;
    }

    public boolean isSingleton() {
        return true;
    }
}
