package org.zll.example.javalearningdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@MapperScan("org.zll.example.javalearningdemo.mapper")
public class JavaLearningDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaLearningDemoApplication.class, args);
    }

}
