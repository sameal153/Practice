package com.practice.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//@SpringBootApplication注解，启动服务器时就是执行的该类中的主方法。
@SpringBootApplication
public class PracticeApplication {

    public static void main(String[] args) {

        SpringApplication.run(PracticeApplication.class, args);
    }

}
