package com.Nayka;

import java.awt.AWTException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.Base_Task;

public class Test2 extends Base_Task {
	public static void main(String[] args) throws InterruptedException, AWTException {
		browserLaunch("chrome");
		LaunchUrl("https://facebook.com/");
		getTitle();
		
		getcurrentUrl();
		
		WebElement text = driver.findElement(By.name("login"));
		getText(text);
		
		WebElement attribute = driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']"));
		getAttribute(attribute,"placeholder");
		
		navigateTo("https://www.amazon.in/");
		navigateTo("https://www.youtube.com");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		navigateback();
		navigateforward();
		navigaterefers();
		Thread.sleep(5000);
		
		WebElement display = driver.findElement(By.xpath("(//yt-formatted-string[text()='Music'])[2]")); //youtube
		isDisplayed(display);
		isEnable(display);
		isSelected(display);
		getcurrentUrl();
		
//		List<WebElement> allText = driver.findElements(By.id("contents"));
//		getallText(allText);
//		
//		screenshot("youtube");
//		
//		navigateTo("https://www.amazon.in/");
//		WebElement mobile = driver.findElement(By.xpath("//a[@href='/mobile-phones/b/?ie=UTF8&node=1389401031&ref_=nav_cs_mobiles']"));
//		Actions(mobile,"rightclick");
//		RobotClass("pressDown");
//		RobotClass("pressEnter");
//		getWindowHandles("getallTiles");
		
		navigateTo("https://www.myntra.com/");
		WebElement search = driver.findElement(By.xpath("//input[@class='desktop-searchBar']"));
		search.sendKeys("shampoo");
		clickonElement(search);
		
		navigateTo("https://demoqa.com/select-menu");
		WebElement cars = driver.findElement(By.id("cars"));
		isMultiple(cars);
		getOptions(cars);
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
