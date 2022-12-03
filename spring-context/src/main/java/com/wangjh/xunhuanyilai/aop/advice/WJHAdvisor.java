package com.wangjh.xunhuanyilai.aop.advice;


import org.aopalliance.aop.Advice;
import org.springframework.aop.Pointcut;
import org.springframework.aop.PointcutAdvisor;
import org.springframework.aop.support.StaticMethodMatcherPointcut;

import java.lang.reflect.Method;

/**
 * 可以指定某些方法执行 Advice，而不是所有的都执行 Advice
 */
public class WJHAdvisor implements PointcutAdvisor {
	@Override
	public Advice getAdvice() {
		return new WJHAroundAdvice();
	}

	@Override
	public boolean isPerInstance() {
		return false;
	}

	@Override
	public Pointcut getPointcut() {
		return new StaticMethodMatcherPointcut() {
			@Override
			public boolean matches(Method method, Class<?> targetClass) {
				return method.getName().equals("test");
			}
		};
	}
}
