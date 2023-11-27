package com.TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Base_Task;
import com.pom.PageObjectManager;

public class FB_Chrome  extends Base_Task{ 

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
