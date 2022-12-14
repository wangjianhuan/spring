package com.wangjh.transactional;


import com.wangjh.transactional.config.AppConfig;
import com.wangjh.transactional.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/**
 * 上节课总结
 * Advisor
 * 		pointcut
 * 			ClassFilter
 * 			MethodMatcher
 * 		Advice——————>Method拦截器
 * <p>
 * Advisor
 * BeanPostprocessor
 * <p>
 *
 * UserService --》 找到所有匹配的 Advisor ---》 利用 ProxyFactory 生成代理对象
 * 代理对象执行某个方法时 ---》 依据当前调用的方法 ---》找到所匹配的 Advisor ----》并执行对应的 Advice 逻辑
 * <p>
 *
 * 1、Spring的事务管理器创建一个数据库连接conn
 * 2、conn.autocommit 修改为 false
 * 3、conn.隔离级别  直接设置到当前连接中
 * 3、把conn连接放入 ThreadLocal<Map> key:DateSource value:conn连接
 * 4、target.test() ---> 执行 sql1、sql2
 * 		a() Spring事务管理器，创建数据库连接conn1 (先挂起test()方法中的DateSource，生成一个挂起对象，在a()方法执行完了后需要用当前的连接器执行后续的sql)
 *  				conn1.autocommit 修改为 false
 *  				conn1.隔离级别  直接设置到当前连接中
 *  				把conn1连接放入 ThreadLocal<Map> key:DateSource value:conn连接
 *  				执行 a() 方法中的 sql
 * 5、提交 | 回滚
 */

public class TransactionalTest {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		UserService userService = (UserService)context.getBean("userService");
		userService.a();
	}

}
