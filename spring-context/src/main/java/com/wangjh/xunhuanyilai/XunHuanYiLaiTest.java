package com.wangjh.xunhuanyilai;

import com.wangjh.xunhuanyilai.config.AppConfig;
import com.wangjh.xunhuanyilai.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class XunHuanYiLaiTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		//AbstractBeanDefinition beanDefinition = BeanDefinitionBuilder.genericBeanDefinition().getBeanDefinition();
		//beanDefinition.setBeanClass(UserService.class);
		//beanDefinition.getConstructorArgumentValues().addGenericArgumentValue(new OrderService());
		//beanDefinition.setAutowireMode(AbstractBeanDefinition.AUTOWIRE_CONSTRUCTOR);
		//context.registerBeanDefinition("userService", beanDefinition);

		 //
		 //在原型Bean下，通过传递方法参数可以直接选定想要的构造方式来执行Bean的创建
		UserService userService1 = (UserService) context.getBean("userService");
		//UserService userService2 = (UserService) context.getBean("userService");


		System.out.println("userService = " + userService1);
		//userService.test();


	}
}
