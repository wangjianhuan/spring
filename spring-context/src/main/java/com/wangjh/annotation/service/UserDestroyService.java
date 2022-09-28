package com.wangjh.annotation.service;

import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

/**
 * @author wjh
 * @date 2022/9/18 21:27
 * @email 1151777592@qq.com
 */
@Component
public class UserDestroyService implements AutoCloseable {

	public UserDestroyService() {
	}

	@PreDestroy
	public void a(){
		System.out.println("UserDestroyService.a");
	}

	public void destroy() throws Exception {
		System.out.println("UserDestroyService.destroy");
	}

	@Override
	public void close() throws Exception {
		System.out.println("UserDestroyService.close");
	}
}
