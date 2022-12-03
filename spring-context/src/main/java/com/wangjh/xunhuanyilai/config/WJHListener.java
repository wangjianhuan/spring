package com.wangjh.xunhuanyilai.config;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * ApplicationListenerDetector 类里面处理了 Listener 逻辑   在初始化后方法里
 * EventListenerMethodProcessor 处理方法上添加的 @EventListener 注解逻辑
 */
//@Component
//@Lazy
public class WJHListener implements ApplicationListener {

	@Override
	//@EventListener
	public void onApplicationEvent(ApplicationEvent event) {
		System.out.println("event = " + event);
	}
}
