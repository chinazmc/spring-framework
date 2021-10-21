package org.springframework.test.mytest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context=
				new ClassPathXmlApplicationContext("org/springframework/test/mytest/spring-aop-test.xml");
		TestInterface test=(TestInterface) context.getBean("test");
		test.helloTest();
		test.a();
	}
}
