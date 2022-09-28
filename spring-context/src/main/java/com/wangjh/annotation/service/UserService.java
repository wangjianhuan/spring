package com.wangjh.annotation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author wjh
 * @date 2022/9/18 21:27
 * @email 1151777592@qq.com
 */
@Component
@Scope("prototype")
public class UserService {

	@Autowired
	private User user;

	@Autowired
	private OrderService orderService;

	public UserService() {
		System.out.println("无参");
	}

	public UserService(OrderService orderService) {
		this.orderService = orderService;
		System.out.println("有参：orderService = " + orderService);
	}

	public void a(){
		System.out.println("方法A");
	}
}
