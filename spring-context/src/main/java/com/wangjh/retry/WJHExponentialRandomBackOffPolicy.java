package com.wangjh.retry;

import org.springframework.retry.backoff.ExponentialBackOffPolicy;
import org.springframework.retry.backoff.ExponentialRandomBackOffPolicy;

public class WJHExponentialRandomBackOffPolicy extends ExponentialBackOffPolicy {

	public WJHExponentialRandomBackOffPolicy() {
		super();
	}

	protected ExponentialBackOffPolicy newInstance() {
		return new ExponentialRandomBackOffPolicy();
	}

	static class WJHExponentialRandomBackOffContext extends WJHExponentialBackOffPolicy.WJHExponentialBackOffContext{

		private volatile Long next = 1000L;

		public WJHExponentialRandomBackOffContext(long interval, double multiplier, long maxInterval) {
			super(interval, multiplier, maxInterval);
		}

		// 获取一个 1，4，16......分钟执行的重试机制
		@Override
		public synchronized long getSleepAndIncrement() {
			next *= 4;
			if (next > super.getMaxInterval()) {
				next = super.getMaxInterval();
			}
			return next;
		}
	}

}
