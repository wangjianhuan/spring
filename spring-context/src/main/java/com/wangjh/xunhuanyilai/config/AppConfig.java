package com.wangjh.xunhuanyilai.config;

import com.wangjh.xunhuanyilai.service.OrderService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.wangjh.xunhuanyilai")
// @EnableAsync
//@Import(OrderService.class)
//@ImportResource("XXX.xml")
public class AppConfig{


	@Bean
	public OrderService orderService (){
		System.out.println("AppConfig.orderService");
		return new OrderService();
	}

}
