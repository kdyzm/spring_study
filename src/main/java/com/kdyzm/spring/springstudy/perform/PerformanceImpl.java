package com.kdyzm.spring.springstudy.perform;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class PerformanceImpl implements Performance {
	private Logger logger=LoggerFactory.getLogger(this.getClass());
	@Override
	public void perform() {
		logger.info("performancing ...");
	}
}
