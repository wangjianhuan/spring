package com.wangjh.mybatis.config;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author wjh
 * @date 2022/12/2 00:57
 * @email 1151777592@qq.com
 */
public class WJHFactoryBean implements FactoryBean {

    private Class mapperInterface;

	private SqlSession sqlSession;

    public WJHFactoryBean(Class mapperInterface) {
        this.mapperInterface = mapperInterface;
    }

	public void setSqlSession(SqlSessionFactory sqlSessionFactory) {
		sqlSessionFactory.getConfiguration().addMapper(mapperInterface);
		this.sqlSession = sqlSessionFactory.openSession();
	}

	@Override
    public Object getObject() throws Exception {
        //Object proxyInstance = Proxy.newProxyInstance(WJHFactoryBean.class.getClassLoader(), new Class[]{mapperInterface}, new InvocationHandler() {
        //    @Override
        //    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //        System.out.println("WJHFactoryBean.invoke:" + method.getName());
        //        return null;
        //    }
        //});
        //return proxyInstance;
		Object mapper = sqlSession.getMapper(mapperInterface);
		return mapper;
    }

    @Override
    public Class<?> getObjectType() {
        return mapperInterface;
    }
}
