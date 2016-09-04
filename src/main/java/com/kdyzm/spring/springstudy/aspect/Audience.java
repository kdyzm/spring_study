package com.kdyzm.spring.springstudy.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Audience {
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Pointcut("execution(** com.kdyzm.spring.springstudy.perform.Performance.perform(..))")
	public void performance() {
	}
	
	@Around("performance()")
	public void watchPerformance(ProceedingJoinPoint jp){
		try {
			logger.info("Silenceing cell phone ..");
			logger.info("Taking seats ..");
			jp.proceed();
			logger.info("CLAP ! CLAP ! ..");
		} catch (Throwable e) {
			logger.info("catch error .",e);
		}
	}
	
	@Before("performance()")
	public void silenceCellPhones() {
		logger.info("Silencing cell phones .");
	}

	@Before("performance()")
	public void takeSeats() {
		logger.info("taking seats.");
	}

	@AfterReturning("performance()")
	public void appLause() {
		logger.info("CLAP ! CLAP! CLAP !");
	}

	@AfterThrowing("performance()")
	public void demondRefund() {
		logger.info("Demanding a refund !");
	}

}
