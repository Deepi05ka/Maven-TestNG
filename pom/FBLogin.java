package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base_Task;

public class FBLogin extends Base_Task  {

	public FBLogin() {
		PageFactory.initElements(driver, this);
	}
	
	//WebElement email = driver.findElement(By.id("email"))
	@FindBy(id = "email")
	private WebElement email;
	
	//WebElement pass = driver.findElement("pass")
	@FindBy(id = "pass")
	private WebElement pass;
	
	public WebElement getEmail() {
		return email;
	}
	
	public WebElement getPass() {
		return pass;
	}
	
	
	
	
	
	
	
	
	
}
