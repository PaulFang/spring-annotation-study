package com.demo.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class LinuxCondition implements Condition {

    public boolean matches(ConditionContext conditionContext,
        AnnotatedTypeMetadata annotatedTypeMetadata) {
        Environment env = conditionContext.getEnvironment();
        String osName = env.getProperty("os.name");
        if(osName.contains("windows")){
            return true;
        }
        return false;
    }
}
