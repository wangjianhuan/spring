package com.wangjh.annotation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author wjh
 * @date 2022/9/18 21:27
 * @email 1151777592@qq.com
 */
@Component
//@Scope("prototype")
public class UserService {

	@Autowired
	private User user;

	public OrderService getOrderService() {
		return orderService;
	}

	@Autowired(required = true)		//必须赋值  ，如果没有赋值则报错
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

	public void setOrderService(OrderService orderService) {
		this.orderService = orderService;
	}

	/**
	 * 使用 @Autowired、@Value()、@Inject注解可以自己执行本方法
	 * 在 Bean 的实例化后，初始化前（属性注入过程中执行）
	 */
//	@Inject
//	public void autoDo() {
//		System.out.println("使用注解自动执行的方法！");
//	}
}
