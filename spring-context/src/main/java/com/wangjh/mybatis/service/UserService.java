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
        System.out.println("userMapper.selectById() = " + userMapper.selectById());

        System.out.println("orderMapper.selectById() = " + orderMapper.selectById());
    }
}
