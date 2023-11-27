package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base_Task;



public class InstagramLogin extends Base_Task{
	
	public InstagramLogin () {
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "username")
	private WebElement phoneno;

	public WebElement getPhoneno() {
		return phoneno;
	}
	
	@FindBy(name = "password")
	private WebElement password;

	public WebElement getPassword() {
		return password;
	}
	
	@FindBy(xpath = "//div[text()='Log in']")
	private WebElement login;

	public WebElement getLogin() {
		return login;
	}
	
	@FindBy(name = "verificationCode")
	private WebElement code;

	public WebElement getCode() {
		return code;
	}
	
	@FindBy(xpath = "//button[text()='Confirm']")
	private WebElement confirm;

	public WebElement getConfirm() {
		return confirm;
	}
	
}























