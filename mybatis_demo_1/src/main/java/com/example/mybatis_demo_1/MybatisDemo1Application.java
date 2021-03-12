package com.example.mybatis_demo_1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@MapperScan("com.example.mybatis_demo_1.mapper")
public class MybatisDemo1Application {

	public static void main(String[] args) {
		SpringApplication.run(MybatisDemo1Application.class, args);
	}

}
