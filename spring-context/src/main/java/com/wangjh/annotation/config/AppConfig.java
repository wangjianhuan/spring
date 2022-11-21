package com.wangjh.annotation.config;

import com.wangjh.annotation.service.OrderService;
import com.wangjh.annotation.service.OrderServiceBY_NAME;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author wjh
 * @date 2022/9/18 21:26
 * @email 1151777592@qq.com
 */
@ComponentScan("com.wangjh.annotation")
public class AppConfig {

	@Bean({"orderService1","orderService2"})
	public OrderService orderService(){
		return new OrderService();
	}

	// autowire 被弃用 现已删除
//	@Bean(autowire = Autowire.BY_NAME)
	public OrderServiceBY_NAME orderServiceBYName(){
		return null;
	}


	//@Bean(autowireCandidate = false)  // autowireCandidate = false 表示不可以进行依赖注入
	public OrderService orderService111(){
		System.out.println("AppConfig.orderService111");
		return new OrderService();
	}
}
