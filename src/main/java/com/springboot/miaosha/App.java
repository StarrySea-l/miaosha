package com.springboot.miaosha;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * Hello world!
 */
@SpringBootApplication
@MapperScan("com.springboot.miaosha.dao")
public class App {
    public static void main(String[] args) {
        System.out.println("hello world");
        SpringApplication.run(App.class, args);
    }
}
