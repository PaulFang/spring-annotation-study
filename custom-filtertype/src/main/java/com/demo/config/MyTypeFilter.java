package com.demo.config;

import java.io.IOException;

import org.springframework.core.io.Resource;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

public class MyTypeFilter implements TypeFilter {

    // 注意： 自定义的 TypeFilter 过滤出来的类可以没有类注解，例如本类 MyTypeFilter
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory)
        throws IOException {

        // 获取当前类的注解信息
        AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();

        // 获取当前正在扫描的类的类信息
        ClassMetadata classMetadata = metadataReader.getClassMetadata();

        // 获取当前类的资源信息
        Resource resource = metadataReader.getResource();

        String className = classMetadata.getClassName();
        System.out.println("className : " + className);
        if(className.contains("er")){
            return true;
        }
        return false;
    }
}
