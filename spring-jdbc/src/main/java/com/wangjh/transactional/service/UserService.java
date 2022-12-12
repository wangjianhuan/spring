package com.wangjh.transactional.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class UserService {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	//@Autowired
	//private UserService userService;

	//@Transactional
	public void test1(){
		jdbcTemplate.execute("select * from test limit 100");
	}
}
