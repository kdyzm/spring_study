package com.kdyzm.spring.springstudy.perform;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class DefaultEncoreable implements Encoreable{
	private Logger logger=LoggerFactory.getLogger(this.getClass());
	@Override
	public void performEncore() {
		logger.info("encoreable working ......");
	}

}
