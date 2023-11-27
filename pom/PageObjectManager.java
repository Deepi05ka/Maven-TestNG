package com.pom;

import org.openqa.selenium.support.PageFactory;

import com.base.Base_Task;

public class PageObjectManager extends Base_Task {
	
	public PageObjectManager() {
		PageFactory.initElements(driver,this);
	}

	private PageObjectModel_Class1 order; 
	
	private PageObjectModel_Class2 proceed;
	
	private FBLogin fblogin;
	
	private InstagramLogin instaLogin;
	

	
	
	
	
	public PageObjectModel_Class1 getOrder() {
		order = new PageObjectModel_Class1();
		return order;
	}
	
	public PageObjectModel_Class2 getProceed() {
		proceed = new PageObjectModel_Class2();
		return proceed;
	}
	
	
	public FBLogin getFblogin() {
		fblogin = new FBLogin();
		return fblogin;
	}

	public InstagramLogin getInstaLogin() {
		instaLogin = new InstagramLogin();
		return instaLogin;
	}

	
	
}
