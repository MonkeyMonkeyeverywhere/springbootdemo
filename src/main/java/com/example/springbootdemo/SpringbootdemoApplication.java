package com.example.springbootdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.DispatcherServlet;

@SpringBootApplication
@ServletComponentScan
@MapperScan("com.example.springbootdemo.mapper")
public class SpringbootdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootdemoApplication.class, args);
	}

	/**
	 * 修改DispatcherServlet默认配置
	 *
	 * @param dispatcherServlet
	 * @return
	 */
//	@Bean
//	public ServletRegistrationBean dispatcherRegistration(DispatcherServlet dispatcherServlet) {
//		ServletRegistrationBean registration = new ServletRegistrationBean(dispatcherServlet);
//		registration.getUrlMappings().clear();
//		registration.addUrlMappings("*.do");
//		registration.addUrlMappings("*.json");
//		return registration;
//	}
}
