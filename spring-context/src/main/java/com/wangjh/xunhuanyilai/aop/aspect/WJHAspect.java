package com.wangjh.xunhuanyilai.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class WJHAspect {

	@Before("execution(public void com.wangjh.xunhuanyilai.service.UserService.test())")
	public void WJHBefore(JoinPoint joinPoint) {
		System.out.println("WJHAspect.WJHBefore");
	}


	@After(value = "execution(public void com.wangjh.xunhuanyilai.service.UserService.test()) && args(a,b)", argNames = "a,b")
	public void WJHAfter(String a, String b) {
		// 这个注解方式可以看 argBounds() 方法
		System.out.println("a = " + a + ", b = " + b);
	}
}
