package com.wangjh.annotation;

import com.wangjh.annotation.config.AppConfig;
import com.wangjh.annotation.service.OrderService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author wjh
 * @date 2022/9/18 21:25
 * @email 1151777592@qq.com
 */
public class AnnotationTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

//		UserService bean = (UserService) context.getBean("userService", new OrderService());
//		UserService bean = (UserService) context.getBean("userService1");
		OrderService bean1 = (OrderService) context.getBean("orderService");
		System.out.println("bean = " + bean1);


	}
}
