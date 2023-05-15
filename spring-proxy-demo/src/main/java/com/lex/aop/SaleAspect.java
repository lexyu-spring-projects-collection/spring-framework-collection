package com.lex.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author : Lex Yu
 * @version : 0.0.1
 * @date : 2023/5/15
 */
@Aspect
@Component
public class SaleAspect {

	private static final Logger log = LoggerFactory.getLogger(SaleAspect.class);

	@Before("execution((..))")
	public void before(JoinPoint joinPoint){

	}

	@Around()
	public Object around(JoinPoint joinPoint){

		return null;
	}

	@After()
	public void after(JoinPoint joinPoint){

	}

	@AfterReturning()
	public void afterReturning(JoinPoint joinPoint){

	}

	@AfterThrowing()
	public void afterThrowing(JoinPoint joinPoint){

	}




}
