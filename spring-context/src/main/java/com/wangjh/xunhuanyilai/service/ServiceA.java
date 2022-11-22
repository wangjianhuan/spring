package com.wangjh.xunhuanyilai.service;

import org.springframework.stereotype.Service;

@Service
public class ServiceA implements A{
	@Override
	public void test() {
		System.out.println("ServiceA.test");
	}
}
