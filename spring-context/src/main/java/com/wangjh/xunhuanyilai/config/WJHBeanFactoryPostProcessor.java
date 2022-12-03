package com.wangjh.xunhuanyilai.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;

//@Component
public class WJHBeanFactoryPostProcessor implements BeanDefinitionRegistryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		//该方法后执行
		//beanFactory.registerSingleton(); 注册一个bean
		System.out.println("WJHBeanFactoryPostProcessor.postProcessBeanFactory");
	}

	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		// 该方法先执行
		//registry.registerBeanDefinition("wang",new GenericBeanDefinition()); 注册一个 beanDefinition
		System.out.println("WJHBeanFactoryPostProcessor.postProcessBeanDefinitionRegistry");
	}
}
