package com.wangjh.transactional;


import com.wangjh.transactional.config.AppConfig;
import com.wangjh.transactional.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TransactionalTest {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		UserService userService = (UserService)context.getBean("userService");
		userService.test1();
	}
}
