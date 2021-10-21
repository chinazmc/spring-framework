package org.springframework.test.mytest;

public class TestImpl implements TestInterface {

	@Override
	public void helloTest() {
		System.out.println("hello world");
	}

	@Override
	public void a() {
		System.out.println("hello aaa");
	}
}
