package com.wangjh.transactional.service.impl;

import com.wangjh.transactional.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Component
public class UserServiceImpl implements UserService{

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	private UserService userService;

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void a(){
		jdbcTemplate.execute("select * from test limit 100");
		userService.b();
	}

	//@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void b(){
		jdbcTemplate.execute("select * from test limit 100");
	}
}
