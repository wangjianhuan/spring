package com.wangjh.retry;

import org.springframework.retry.backoff.BackOffContext;
import org.springframework.retry.backoff.ExponentialBackOffPolicy;

public class WJHExponentialBackOffPolicy extends ExponentialBackOffPolicy {

	static class WJHExponentialBackOffContext implements BackOffContext{

		private final double multiplier;

		private long interval;

		private long maxInterval;

		public WJHExponentialBackOffContext(long interval, double multiplier, long maxInterval) {
			this.interval = interval;
			this.multiplier = multiplier;
			this.maxInterval = maxInterval;
		}

		public synchronized long getSleepAndIncrement() {
			long sleep = this.interval;
			if (sleep > this.maxInterval) {
				sleep = this.maxInterval;
			}
			else {
				this.interval = getNextInterval();
			}
			return sleep;
		}

		protected long getNextInterval() {
			return (long) (this.interval * this.multiplier);
		}

		public double getMultiplier() {
			return this.multiplier;
		}

		public long getInterval() {
			return this.interval;
		}

		public long getMaxInterval() {
			return this.maxInterval;
		}

	}

}
