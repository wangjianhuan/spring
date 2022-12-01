package com.wangjh.xunhuanyilai.service;

import org.springframework.stereotype.Service;

@Service
// @Scope(scopeName = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
//@Lazy
public class UserService {

	// //@Autowired
	// private OrderService orderService;



	//@Autowired(required = false)
	public UserService() {
		System.out.println("UserService.UserService:无参构造方法");
	}


	//
	//
	// //@Autowired(required = false)
	// public UserService(OrderService orderService) {
	// 	this.orderService = orderService;
	// 	System.out.println("UserService.UserService:有参构造方法");
	// }
	//
	// //@Autowired(required = false)
	// //@ConstructorProperties("orderService")
	// public UserService(OrderService orderService, OrderService orderService1) {
	// 	this.orderService = orderService;
	// 	this.orderService = orderService1;
	// 	System.out.println("UserService.UserService:有参构造方法1");
	// }

	// @Async
	public void test(){
		System.out.println("AService.test");
	}
}
