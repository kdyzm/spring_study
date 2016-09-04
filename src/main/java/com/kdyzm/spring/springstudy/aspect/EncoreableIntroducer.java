package com.kdyzm.spring.springstudy.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

import com.kdyzm.spring.springstudy.perform.DefaultEncoreable;
import com.kdyzm.spring.springstudy.perform.Encoreable;
 
@Aspect
@Component
public class EncoreableIntroducer {
	@DeclareParents(value = "com.kdyzm.spring.springstudy.perform.Performance+", defaultImpl = DefaultEncoreable.class)
	public static Encoreable encoreable;
}
