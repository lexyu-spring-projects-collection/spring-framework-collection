package com.lex.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * @author : Lex Yu
 * @version : 0.0.1
 * @date : 2023/5/15
 */
@Aspect
@Component
public class SaleAspect {

	private static final Logger log = LoggerFactory.getLogger(SaleAspect.class);

	@Before("execution(* com.lex.core.Sales.doSale(..))")
	public void before(JoinPoint joinPoint) {
		log.info("before");
		log.info("sales will received $" + joinPoint.getArgs()[0]);
	}

	@Around("execution(* com.lex.core.Sales.doSale(..))")
	public Object around(ProceedingJoinPoint pjp) throws Throwable {
		log.info("around");
		log.info("around - pjp.getArgs() = {}", pjp.getArgs());
		Object amount = pjp.proceed(pjp.getArgs());
		log.info("around return " + amount);
		return amount;
	}

	@After("execution(* com.lex.core.Sales.doSale(..))")
	public void after(JoinPoint joinPoint) {
		log.info("after");
		Object[] args = joinPoint.getArgs();
		log.info("Args = {}", args);
	}

	@AfterReturning(value = "execution(* com.lex.core.Sales.doSale(..))", returning = "amount")
	public void afterReturning(BigDecimal amount) {
		log.info("sales after returning $" + amount);
	}

	@AfterThrowing(value = "execution(* com.lex.core.Sales.doSale(..))", throwing = "error")
	public void afterThrowing(JoinPoint joinPoint, Throwable error) {
		log.info("after throw " + error);
	}


}
