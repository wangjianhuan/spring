package com.wangjh.XML.service;

public class A {

	private B b;

	public B getB() {
		System.out.println("A.getB");
		return b;
	}

	public void setB(B b) {
		System.out.println("A.setB");
		this.b = b;
	}

	@Override
	public String toString() {
		return "A{" +
				"b=" + b +
				'}';
	}
}
