package com.TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Base_Task;
import com.pom.PageObjectManager;

public class FBLogin_Attributes extends Base_Task {
	
	//priority = it decide the order of excecution,Default value is zero,it have positive & negative value
	//Before method -it will be run before the each test methods
	//After method -it will be run After the each test methods
	//invocationCount - if you want to run a single test in multiple times use invocationCount
	//invocationTimeOut -it will be wait for specified amount of time in milliseconds
	//dependsOnMethods -one property depends from another property
	//expectedExceptions = NoSuchSessionException.class -  it verfity the expectedExceptions is occur ,it dosn't shows a error
	//enabled - skip the test method
	//@Ignore -skip the test 

	PageObjectManager pom = new PageObjectManager();
	
	@BeforeMethod
	private void browser() {
	browserLaunch("chrome");
	LaunchUrl("https://www.facebook.com/");
    }
	

	
    @Test
    private void data() {
	sendKeys(pom.getFblogin().getEmail(),"deeryojk");
	sendKeys(pom.getFblogin().getPass(), "dgg$678");
   }

    @AfterMethod
    private void closeBrowser() {
    	quit();
    }
	
	
	
	
	
	
	
	
	
	
	

}
