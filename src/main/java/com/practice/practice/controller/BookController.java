package com.practice.practice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName: BookController
 * Package: com.practice.practice.controller
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 2024/3/19 16:40
 * @Version 1.0
 */

    @RestController
    @RequestMapping("/books")
    public class BookController {
    @Value("${lesson}")
    private String lesson;
    @Value("${server.port}")
    private Integer port;
    @Value("${enterprise.subject[0]}")
    private String subject_00;
        @GetMapping("/{id}")
        public String getById(@PathVariable Integer id){
            System.out.println(lesson);
            System.out.println(port);
            System.out.println(subject_00);
            return "hello , spring boot!";
        }
    }


