package com.tom.bbs_day0124;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.tom.bbs_day0124.mapper")
public class BbsDay0124Application {

    public static void main(String[] args) {
        SpringApplication.run(BbsDay0124Application.class, args);
    }

}

