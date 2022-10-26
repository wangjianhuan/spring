package com.wangjh.annotation;

import com.wangjh.annotation.config.AppConfig;
import com.wangjh.annotation.service.UserService;
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
//		OrderService bean1 = (OrderService) context.getBean("orderService");
//		OrderService bean111 = (OrderService) context.getBean("orderService");
//		System.out.println(bean1);
		UserService bean = (UserService) context.getBean("userService");
		UserService bean1 = (UserService) context.getBean("userService");
		UserService bean2 = (UserService) context.getBean("userService");
		System.out.println(bean);
		System.out.println(bean.getOrderService());
		System.out.println(bean1);
		System.out.println(bean1.getOrderService());
		System.out.println(bean2);
		System.out.println(bean2.getOrderService());


//		User user = (User) context.getBean("user");
//		user.aVoid();



		// 调用 close 方法销毁 Bean 是调用 Bean 销毁方法
		// 1 @PreDestroy 	2 implements DisposableBean(AutoCloseable) 	3 registerShutdownHook()
		context.registerShutdownHook();
		context.close();
	}
}
