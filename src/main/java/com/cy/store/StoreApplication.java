package com.cy.store;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// TODO 建议以后直接在SpringBoot启动类中加@MapperScan("mapper包") 注解，这样会比较方便，不需要对每个Mapper都添加@Mapper注解。
@MapperScan("com.cy.store.mapper")
public class StoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(StoreApplication.class, args);
	}

}
