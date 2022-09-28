package com.wangjh.annotation.beanPostProcessor;

import com.wangjh.annotation.service.OrderService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.support.MergedBeanDefinitionPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.stereotype.Component;

@Component
public class WJHBeanPostProcessor implements MergedBeanDefinitionPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("初始化前");
		return MergedBeanDefinitionPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("初始化后");
		return MergedBeanDefinitionPostProcessor.super.postProcessAfterInitialization(bean, beanName);
	}

	/**
	 * 可以对 BeanDefinition 进行修改
	 */
	@Override
	public void postProcessMergedBeanDefinition(RootBeanDefinition beanDefinition, Class<?> beanType, String beanName) {
		if (beanName.equals("userService")){
			beanDefinition.setInitMethodName("a");
//			beanDefinition.getPropertyValues().add("orderService", new OrderService());
//			beanDefinition.setScope("ads");
		}
	}
}
