package com.Nayka;

import java.io.IOException;

import com.base.Base_Task;
import com.pom.PageObjectModel;

public class Nykaa_test1 extends Base_Task {
	
	public static void window() throws InterruptedException, IOException {
		browserLaunch("chrome");
		LaunchUrl("https://www.nykaa.com/");
		getTitle();
		
		PageObjectModel obj = new PageObjectModel();
		
		Actions(obj.getSkin(),"movetoelement");
		
        clickonElement(obj.getSelcet());
        getWindowHandles();
        clickonElement(obj.getFacewash());
        getWindowHandles("getAllTitle");
        DropDownVisibleText(obj.getDropdown(), "Tea Tree & Neem");
        clickonElement(obj.getAddtoBag());
        clickonElement(obj.getBag());
        Thread.sleep(2000);
        
        Thread.sleep(5000);
        screenshot("Nykaabag");
        frame(0);
        Thread.sleep(3000);
        
        clickonElement(obj.getQuanity());
        clickonElement(obj.getQuanityChoose()); //quanity choose
        clickonElement(obj.getProceed()); //proceed button
        clickonElement(obj.getGuest()); 
        Thread.sleep(5000);
        
        sendKeys(obj.getPincode(),"602001"); //pincode
        Thread.sleep(3000);
        
        clickonElement(obj.getHouse());
        Thread.sleep(5000);
        sendKeys(obj.getHouse(),"72");
        
        sendKeys(obj.getArea(),"Gh road"); // area name
        sendKeys(obj.getName(),"Deepika"); // name
        sendKeys(obj.getPhoneno(),"7788443366"); //phone no
        sendKeys(obj.getEmail(),"deepika12@gmail.com"); //email
        Thread.sleep(3000);
        clickonElement(obj.getShiptotheaddress());

        Thread.sleep(2000);
        //WebElement deliver = driver.findElement(By.xpath("//p[text()='Cash on delivery']"));
        clickonElement(obj.getDeliver());
	}

	




	public static void main(String[] args) throws InterruptedException, IOException  {
		window();
	} }

	