package com.wangjh.xunhuanyilai.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

	//@Autowired
	private UserService userService;

	@Autowired
	private OrderService orderService;
}
