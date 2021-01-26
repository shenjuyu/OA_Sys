package com.sjy.OA_Sys;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@MapperScan("com.sjy.OA_Sys")
@ServletComponentScan
public class OaSysApplication {

	public static void main(String[] args) {
		SpringApplication.run(OaSysApplication.class, args);
	}

}
