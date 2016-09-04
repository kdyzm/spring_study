package com.kdyzm.spring.springstudy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;

import com.kdyzm.spring.springstudy.aspect.Audience;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = { "com.kdyzm.spring.springstudy" })
@Import(value = { SecurityConfig.class })
public class Config {

	@Bean
	public Audience audience() {
		return new Audience();
	}
}
