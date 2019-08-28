package com.wechat.reg;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.wechat.reg.dao"})
public class RegApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegApplication.class, args);
	}

}
