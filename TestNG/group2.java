package com.TestNG;

import org.testng.annotations.Test;

public class group2 {

	@Test(groups = {"smoke","sanity"})
	public void test4() {
		System.out.println("test4");
	}
	
	@Test(groups = {"regression","sanity"})
	public void test5() {
		System.out.println("test5");
	}
	
	@Test(groups = {"funtional"})
	public void test6() {
		System.out.println("test6");
	}
	
	@Test
	public void test7() {
		System.out.println("test7");
	}
}
