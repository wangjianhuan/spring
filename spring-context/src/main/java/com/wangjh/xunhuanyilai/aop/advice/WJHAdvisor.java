package com.wangjh.xunhuanyilai.aop.advice;


import org.aopalliance.aop.Advice;
import org.springframework.aop.ClassFilter;
import org.springframework.aop.MethodMatcher;
import org.springframework.aop.Pointcut;
import org.springframework.aop.PointcutAdvisor;

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
		return new Pointcut() {
			@Override
			public ClassFilter getClassFilter() {
				// 类上的筛选
				return new ClassFilter() {
					@Override
					public boolean matches(Class<?> clazz) {
						return false;
					}
				};
			}

			//方法上的筛选
			@Override
			public MethodMatcher getMethodMatcher() {
				return new MethodMatcher() {
					@Override
					public boolean matches(Method method, Class<?> targetClass) {
						return false;
					}

					// 如果 isRuntime 返回的是 true ，则检验方法传进来的参数进行匹配
					@Override
					public boolean isRuntime() {
						return false;
					}

					@Override
					public boolean matches(Method method, Class<?> targetClass, Object... args) {
						return false;
					}
				};
			}
		};
	}

	//@Override
	//public Pointcut getPointcut() {
	//	return new StaticMethodMatcherPointcut() {
	//		@Override
	//		public boolean matches(Method method, Class<?> targetClass) {
	//			return method.getName().equals("test");
	//		}
	//	};
	//}
}
