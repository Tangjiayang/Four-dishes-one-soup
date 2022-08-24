package com.vegetable;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.vegetable.mapper")
@MapperScan("com.baomidou.mybatisplus.samples.quickstart.mapper")
public class ShortvApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShortvApplication.class, args);
    }}

