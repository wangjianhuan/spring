package com.wangjh;

import com.wangjh.code.MyClassPathXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
//
//		MyClassPathXmlApplicationContext context = new MyClassPathXmlApplicationContext("beam.xml");
		System.out.println(context.getBean("A"));

	}
}
