package com.java.controller.front;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;

/**
 * Description:
 * @name FrontController.java
 * @author tomato
 * @version v1.0 
 * @date 2018/10/2 01:09
 * 这个是SpringBoot启动项目，即简单的url localhost:8848/index.jsp 调用服务器index,jsp页面
 * 在页面显示当前时间
 */

@Controller
@EnableAutoConfiguration    //启用SpringBoot的配置
@ComponentScan(basePackages = {"com.java.Controller.*", "com.java.service.impl"})
@MapperScan(value = "com.java.mapper")
public class FrontController {
	public static void main(String[] args) {
		//启动SpringBoot
		SpringApplication.run(FrontController.class, args);
	}
	

}
