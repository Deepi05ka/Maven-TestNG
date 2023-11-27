package com.Listeners;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({ItestListenersClass.class})
public class TestClass {

	@Test
	public void test1() {
		System.out.println("test1");
	}
	@Test
public void test2() {
		System.out.println("test2");
	}
	
	@Test
public void test3() {
	System.out.println("test3");
}
	@Test
public void test4() {
	System.out.println("test4");
	}
}
