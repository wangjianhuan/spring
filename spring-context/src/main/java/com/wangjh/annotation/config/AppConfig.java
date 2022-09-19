package com.wangjh.annotation.config;

import com.wangjh.annotation.service.OrderService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author wjh
 * @date 2022/9/18 21:26
 * @email 1151777592@qq.com
 */
@ComponentScan("com.wangjh.annotation")
public class AppConfig {

//	@Bean({"orderService1","orderService2"})
//	public OrderService orderService(){
//		return new OrderService();
//	}
}
