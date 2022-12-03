package com.wangjh.xunhuanyilai.aop.advice;


import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class WJHAroundAdvice implements MethodInterceptor {
	@Nullable
	@Override
	public Object invoke(@NotNull MethodInvocation invocation) throws Throwable {
		System.out.println("方法环绕前");
		// 必须显示的执行当前这个方法   否则将不会执行 proceed() 方法， 别的里面不需要显式的执行
		Object proceed = invocation.proceed();
		System.out.println("方法环绕后");
		return proceed;
	}
}
