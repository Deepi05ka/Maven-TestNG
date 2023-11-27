package com.TestNG;

import org.testng.annotations.Test;

@Test(groups = {"all"})
public class group1 {
 
	@Test(groups = {"smoke"})
	public void test1() {
		System.out.println("test1");
	}
	
	@Test(groups = {"functional"})
	public void test2() {
		System.out.println("test2");
	}
	
	@Test(groups = {"regression"})
	public void test3() {
		System.out.println("test3");
	}
	@Test(dependsOnGroups = "smoke")
	public void test() {
		System.out.println("main test");
	}
	
}
