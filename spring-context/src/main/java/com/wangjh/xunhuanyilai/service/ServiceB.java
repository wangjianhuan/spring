package com.wangjh.xunhuanyilai.service;

import org.springframework.stereotype.Service;

@Service
public class ServiceB implements A{
	@Override
	public void test() {
		System.out.println("ServiceB.test");
	}
}
