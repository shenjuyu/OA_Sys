package com.sjy.OA_Sys;


import java.util.Arrays;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan("com.sjy.OA_Sys.dao")
@ServletComponentScan
//@EnableScheduling 定时任务
public class OaSysApplication {

	public static void main(String[] args) {
		SpringApplication.run(OaSysApplication.class, args);
	}
	
	/**
	 * 查看注入了哪些包
	 * @param ctx
	 * @return
	 */
//	@Bean
//    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
//        return args -> {
// 
//            System.out.println("Let's inspect the beans provided by Spring Boot:");
// 
//            String[] beanNames = ctx.getBeanDefinitionNames();
//            Arrays.sort(beanNames);
//            for (String beanName : beanNames) {
//                System.out.println(beanName);
//            }
// 
//        };
//    }

}
