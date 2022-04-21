package com.wangjh.code;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wjh
 */
public class MyClassPathXmlApplicationContext extends ClassPathXmlApplicationContext {

	public MyClassPathXmlApplicationContext(String... configLocations){
		super(configLocations);
	}
	@Override
	protected void initPropertySources() {
		System.out.println("扩展initPropertySources方法");
		getEnvironment().setRequiredProperties("username");
	}
}
