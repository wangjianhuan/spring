package com.wangjh.xunhuanyilai;

import com.wangjh.xunhuanyilai.config.AppConfig;
import com.wangjh.xunhuanyilai.service.OrderService;
import com.wangjh.xunhuanyilai.service.UserService;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class XunHuanYiLaiTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(AppConfig.class);

		AbstractBeanDefinition beanDefinition = BeanDefinitionBuilder.genericBeanDefinition().getBeanDefinition();
		beanDefinition.setBeanClass(UserService.class);
		beanDefinition.getConstructorArgumentValues().addGenericArgumentValue(new OrderService());
		beanDefinition.setAutowireMode(AbstractBeanDefinition.AUTOWIRE_CONSTRUCTOR);
		context.registerBeanDefinition("userService", beanDefinition);

		context.refresh();

		// 在原型Bean下，通过传递方法参数可以直接选定想要的构造方式来执行Bean的创建
		//UserService userService = (UserService) context.getBean("userService", new OrderService());
		//UserService userService1 = (UserService) context.getBean("userService", new OrderService(), new OrderService());


		//System.out.println("userService = " + userService);
		//userService.test();
	}
}
