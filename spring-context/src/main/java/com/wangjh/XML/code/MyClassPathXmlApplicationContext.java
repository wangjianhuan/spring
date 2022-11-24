package com.wangjh.XML.code;

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
		// 添加VM参数  -Dusername=XXX
	}
}
