
package com.TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.base.Base_Task;
import com.pom.PageObjectManager;

public class Parameter extends Base_Task {
	
PageObjectManager pom = new PageObjectManager();
	
	@BeforeMethod
	private void browser() {
	browserLaunch("chrome");
	LaunchUrl("https://www.facebook.com/");
    }
	
	@Parameters({"username","password"})
	@Test
	private void data(String username,String password) {
		sendKeys(pom.getFblogin().getEmail(),username);
		sendKeys(pom.getFblogin().getPass(), password);
	   }

    @AfterMethod
    private void closeBrowser() {
	close();
    }
}
