package com.wangjh.annotation.service;

import org.springframework.stereotype.Component;

/**
 * @author wjh
 * @date 2022/9/18 21:28
 * @email 1151777592@qq.com
 */
@Component
public class User {

	private Integer id;

	private String name;

	@Override
	public String toString() {
		return "User{" +
				"id=" + id +
				", name='" + name + '\'' +
				'}';
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
