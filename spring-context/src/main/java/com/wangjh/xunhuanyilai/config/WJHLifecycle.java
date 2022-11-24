package com.wangjh.xunhuanyilai.config;

import org.springframework.context.SmartLifecycle;
import org.springframework.stereotype.Component;

@Component
public class WJHLifecycle implements SmartLifecycle {

	private boolean flag = false;

	@Override
	public void start() {
		System.out.println(1);
		flag = true;
	}

	@Override
	public void stop() {
		System.out.println(2);
	}

	@Override
	public boolean isRunning() {
		return flag;
	}
}
