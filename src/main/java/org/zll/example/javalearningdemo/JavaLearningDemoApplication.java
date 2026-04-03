package org.zll.example.javalearningdemo;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@Slf4j
@SpringBootApplication
@MapperScan("org.zll.example.javalearningdemo.mapper")
public class JavaLearningDemoApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(JavaLearningDemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        log.info("=================启动成功================");
    }
}
