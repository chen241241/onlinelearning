package com.ck.onlinelearning;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.ck.onlinelearning.dao")
public class OnlinelearningApplication {

    public static void main(String[] args) {
        SpringApplication.run(OnlinelearningApplication.class, args);
    }

}
