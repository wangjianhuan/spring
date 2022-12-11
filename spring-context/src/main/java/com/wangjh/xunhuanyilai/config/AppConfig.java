package com.wangjh.xunhuanyilai.config;

import com.wangjh.xunhuanyilai.aop.advice.WJHAroundAdvice;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.aop.support.NameMatchMethodPointcut;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@ComponentScan("com.wangjh.xunhuanyilai")
// @EnableAsync
//@Import(OrderService.class)
//@ImportResource("XXX.xml")
//@Import(DefaultAdvisorAutoProxyCreator.class)
//@EnableAspectJAutoProxy(proxyTargetClass = true) // 只会使用cglib
@EnableAspectJAutoProxy
//@Import(AnnotationAwareAspectJAutoProxyCreator.class)
public class AppConfig {


	//@Bean
	//public OrderService orderService() {
	//	System.out.println("AppConfig.orderService");
	//	return new OrderService();
	//}


	// 通过导入 DefaultAdvisorAutoProxyCreator 这个类来实现 aop 功能(在 beanPostProcess 中实现的)
	@Bean
	public DefaultPointcutAdvisor defaultPointcutAdvisor() {
		NameMatchMethodPointcut pointcut = new NameMatchMethodPointcut();
		pointcut.addMethodName("aVoid");
		DefaultPointcutAdvisor defaultPointcutAdvisor = new DefaultPointcutAdvisor();
		defaultPointcutAdvisor.setPointcut(pointcut);
		defaultPointcutAdvisor.setAdvice(new WJHAroundAdvice());
		return defaultPointcutAdvisor;
	}


}
