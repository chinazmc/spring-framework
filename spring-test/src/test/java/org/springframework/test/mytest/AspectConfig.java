package org.springframework.test.mytest;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class AspectConfig {
	@Pointcut(value = "execution(* org.springframework.test.mytest.*.*Test(..))")
	public void test(){}

	@Before(value = "test()")
	public void beforeAdvice(){
		System.out.println("before execute");
	}
	@After(value = "test()")
	public void afterAdvice(){
		System.out.println("after execute");
	}
	@Around(value="test()")
	public void arroundAdvice(ProceedingJoinPoint joinPoint){
		try {
			System.out.println("arround start");
			joinPoint.proceed();
			System.out.println("arround end");
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
}
