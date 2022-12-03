package com.wangjh.xunhuanyilai;

import com.wangjh.xunhuanyilai.config.AppConfig;
import com.wangjh.xunhuanyilai.service.UserService;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class XunHuanYiLaiTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		//AbstractBeanDefinition beanDefinition = BeanDefinitionBuilder.genericBeanDefinition().getBeanDefinition();
		//beanDefinition.setBeanClass(UserService.class);
		//beanDefinition.getConstructorArgumentValues().addGenericArgumentValue(new OrderService());
		//beanDefinition.setAutowireMode(AbstractBeanDefinition.AUTOWIRE_CONSTRUCTOR);
		//context.registerBeanDefinition("userService", beanDefinition);

		//
		//在原型Bean下，通过传递方法参数可以直接选定想要的构造方式来执行Bean的创建
		//UserService userService1 = (UserService) context.getBean("userService");
		//UserService userService2 = (UserService) context.getBean("userService");


		// Map<String, BeanPostProcessor> beans = context.getBeansOfType(BeanPostProcessor.class);
		// for (Map.Entry<String, BeanPostProcessor>  item : beans.entrySet()) {
		// 	System.out.println("============");
		// 	Map<String, ? extends BeanPostProcessor> map = context.getBeansOfType(item.getValue().getClass());
		// 	System.out.println("map = " + map);
		// }

		//System.out.println("userService = " + userService1);
		// 发布事件
		//context.publishEvent("23113");
		//userService.test();



		//  以下是AOP相关知识
		UserService target = new UserService();
		//
		//// jdk 不允许使用反射相关功能  可以在vm启动参数添加 --add-opens java.base/java.lang=ALL-UNNAMED 来解决
		//Enhancer enhancer = new Enhancer();
		//enhancer.setSuperclass(UserService.class);
		//// NoOp.INSTANCE 是不执行任何一个 MethodInterceptor
		//enhancer.setCallbacks(new Callback[]{new MethodInterceptor() {
		//	@Override
		//	public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
		//		System.out.println("XunHuanYiLaiTest.intercept: before");
		//		// invoke(args1,args2) 方法执行 args1 参数的方法
		//		//Object result = methodProxy.invoke(target, objects);
		//		// invokeSuper(args1,args2) 方法执行 args1 参数的父类的方法
		//		Object result = methodProxy.invokeSuper(o, objects);
		//		System.out.println("XunHuanYiLaiTest.intercept: after");
		//		return result;
		//	}
		//}, new MethodInterceptor() {
		//	@Override
		//	public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
		//		System.out.println("intercept 方法2： before");
		//		Object result = methodProxy.invokeSuper(o, objects);
		//		System.out.println("intercept 方法2： after");
		//		return result;
		//	}
		//}, NoOp.INSTANCE});
		//
		//enhancer.setCallbackFilter(new CallbackFilter() {
		//	@Override
		//	public int accept(Method method) {
		//		if (method.getName().equals("test")) {
		//			return 0;
		//		}
		//		if (method.getName().equals("aVoid")) {
		//			return 2;
		//		}
		//		return 0;
		//	}
		//});
		//
		//UserService userService = (UserService) enhancer.create();
		//userService.test();
		//userService.aVoid();

		//// JDK 动态代理
		//UserInterface userInterface = (UserInterface) Proxy.newProxyInstance(XunHuanYiLaiTest.class.getClassLoader(), new Class[]{UserInterface.class}, new InvocationHandler() {
		//	@Override
		//	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		//		System.out.println("XunHuanYiLaiTest.invoke --> JDK代理：before");
		//		method.invoke(target, args);
		//		System.out.println("XunHuanYiLaiTest.invoke --> JDK代理：after");
		//		return null;
		//	}
		//});
		//
		//userInterface.test();

		ProxyFactory proxyFactory = new ProxyFactory();
		proxyFactory.setTarget(target);
		//proxyFactory.setInterfaces(UserInterface.class);
		// 添加 advice 的顺序会因影响他的执行顺序
		//proxyFactory.addAdvice(new WJHAroundAdvice());
		//proxyFactory.addAdvice((MethodBeforeAdvice) (method, args1, target1) -> System.out.println("XunHuanYiLaiTest.ProxyFactory.before"));
		//proxyFactory.addAdvisor(new WJHAdvisor());
		UserService proxy = (UserService) proxyFactory.getProxy();
		proxy.aVoid();
		proxy.test();
	}
}
