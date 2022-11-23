package com.wangjh.XML;

import com.wangjh.XML.selfEditor.Customer;
import com.wangjh.XML.service.A;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		// ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("selfEditor.xml");
		// MyClassPathXmlApplicationContext context = new MyClassPathXmlApplicationContext("selfEditor.xml");

//		String version1 = SpringVersion.getVersion();
//		System.out.println("version1 = " + version1);


		System.out.println(context.getBean(A.class));
		System.out.println(context.getBean(Customer.class));

	}
}
