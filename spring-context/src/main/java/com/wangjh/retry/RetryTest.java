package com.wangjh.retry;

import org.springframework.retry.policy.SimpleRetryPolicy;
import org.springframework.retry.support.RetryTemplate;

import java.time.LocalDateTime;
import java.util.HashMap;

public class RetryTest {
	public static void main(String[] args) throws Exception {
		test();
	}

	static void test() throws Exception {


		HashMap<Class<? extends Throwable>, Boolean> retryableExceptions = new HashMap<>();
		retryableExceptions.put(Exception.class, Boolean.TRUE);
		WJHExponentialRandomBackOffPolicy backOffPolicy = new WJHExponentialRandomBackOffPolicy();
		RetryTemplate retryTemplate = new RetryTemplate();
		retryTemplate.setRetryPolicy(new SimpleRetryPolicy(3, retryableExceptions));
		retryTemplate.setBackOffPolicy(backOffPolicy);
		retryTemplate.execute(retryContext->{
			System.out.println(LocalDateTime.now());
			if (10%7==0)
				throw new Exception("ds");
			return true;
		});
	}
}
