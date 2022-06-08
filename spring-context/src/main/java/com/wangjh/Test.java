package com.wangjh;

import com.wangjh.code.MyClassPathXmlApplicationContext;
import com.wangjh.selfEditor.Customer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("selfEditor.xml");
//		MyClassPathXmlApplicationContext context = new MyClassPathXmlApplicationContext("selfEditor.xml");
		System.out.println(context.getBean(Customer.class));

	}
}
