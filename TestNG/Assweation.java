package com.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.base.Base_Task;

public class Assweation extends Base_Task{

	@Test
	 private void demo() {
		 browserLaunch("chrome");
		 LaunchUrl("https://www.google.com/");
		 driver.findElement(By.name("q")).sendKeys("rose",Keys.ENTER);
		 String expected = "ro - Google Search";
		 String actual = driver.getTitle();
		 SoftAssert sa = new SoftAssert();
		 sa.assertEquals(actual, expected,"Title is mismatched");
		 sa.assertAll();
		 System.out.println("soft");
	 }
}
