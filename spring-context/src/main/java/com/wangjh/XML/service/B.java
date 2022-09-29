package com.wangjh.XML.service;

public class B {

	private A a;

	public A getA() {
		System.out.println("B.getA");
		return a;
	}

	public void setA(A a) {
		System.out.println("B.setA");
		this.a = a;
	}
}
