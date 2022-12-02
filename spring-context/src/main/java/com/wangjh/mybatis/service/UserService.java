package com.wangjh.mybatis.service;

import com.wangjh.mybatis.mapper.OrderMapper;
import com.wangjh.mybatis.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author wjh
 * @date 2022/12/2 00:45
 * @email 1151777592@qq.com
 */
@Component
public class UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private OrderMapper orderMapper;

    public void test() {

		//userMapper.selectById() 执行过程 SqlSessionTemplate.selectOne --> SqlSessionProxy.selectOne --> DefaultSqlSessionFactory.selectOne
        System.out.println("userMapper.selectById() = " + userMapper.selectById());
		// mybatis 一级缓存会影响隔离级别，不建议开启
        System.out.println("orderMapper.selectById() = " + orderMapper.selectById());

		for (String s : userMapper.selectAll()) {
			System.out.println("s = " + s);
		}

	}
}
