package com.wangjh.transactional.service.impl;

import com.wangjh.transactional.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderService orderService;

	@Transactional
	@Override
	public void a(){
		System.out.println("1111");
	}
}
