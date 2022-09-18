package com.wangjh;

import com.wangjh.code.MyClassPathXmlApplicationContext;
import com.wangjh.selfEditor.Customer;
import com.wangjh.service.A;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.SpringVersion;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
//		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("selfEditor.xml");
//		MyClassPathXmlApplicationContext context = new MyClassPathXmlApplicationContext("selfEditor.xml");

//		String version1 = SpringVersion.getVersion();
//		System.out.println("version1 = " + version1);


		System.out.println(context.getBean(A.class));

	}
}
