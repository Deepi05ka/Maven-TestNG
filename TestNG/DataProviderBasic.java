package com.TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.base.Base_Task;

import com.pom.PageObjectManager;

public class DataProviderBasic extends Base_Task {
	
PageObjectManager pom = new PageObjectManager();
	
	@BeforeMethod
	private void browser() {
	browserLaunch("chrome");
	LaunchUrl("https://www.facebook.com/");
    }
	
	@DataProvider(name = "data")
	private Object[][] getData() {
		Object data[][] = new Object[2][2];
		data[0][0] = "Jhon";
		data[0][1] = "Jhone@13";
		data[1][0] = "peter";
		data[1][1] ="peter@#5";
		return data;
		
	}
//	
    @Test(dataProvider = "data")
     private void data(String username,String password) {
	sendKeys(pom.getFblogin().getEmail(),username);
	sendKeys(pom.getFblogin().getPass(), password);
   }
	

    @AfterMethod
    private void closeBrowser() {
	close();
    }

}
