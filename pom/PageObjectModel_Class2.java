package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base_Task;

public class PageObjectModel_Class2 extends Base_Task {
	
	public PageObjectModel_Class2(){
		PageFactory.initElements(driver, this);
	}
	
	
		//WebElement pincode = driver.findElement(By.xpath("//input[@placeholder='Pincode']"));
		@FindBy(xpath = "//input[@placeholder='Pincode']")
		private WebElement pincode;
		
		public WebElement getPincode() {
			return pincode;
		}
		
		//WebElement house = driver.findElement(By.xpath("(//input[@type='text'])[3]")); 
		@FindBy(xpath = "(//input[@type='text'])[3]")
		private WebElement house;
		
		public WebElement getHouse() {
			return house;
		}
		
		//WebElement area = driver.findElement(By.xpath("//textarea[@placeholder='Road Name/ Area /Colony']"));
		@FindBy(xpath = "//textarea[@placeholder='Road Name/ Area /Colony']")
		private WebElement area;
		
		public WebElement getArea() {
			return area;
		} 
		
		//WebElement name = driver.findElement(By.xpath("//input[@placeholder='Name']"));
		@FindBy(xpath = "//input[@placeholder='Name']")
		private WebElement name;
		
		public WebElement getName() {
			return name;
		}
		
		//WebElement phoneno = driver.findElement(By.xpath("//input[@placeholder='Phone']"));
		@FindBy(xpath = "//input[@placeholder='Phone']")
		private WebElement phoneno;
		
	    public WebElement getPhoneno() {
			return phoneno;
		}
	    
	  //WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		@FindBy(xpath = "//input[@type='email']")
		private WebElement email;
		
		public WebElement getEmail() {
			return email;
		}
		
		//WebElement shiptotheaddress  = driver.findElement(By.xpath("//button[text()='Ship to this address']"));
		@FindBy(xpath = "//button[text()='Ship to this address']")
		private WebElement shiptotheaddress;
		
		public WebElement getShiptotheaddress() {
			return shiptotheaddress;
		}
		
		////WebElement deliver = driver.findElement(By.xpath("//p[text()='Cash on delivery']"));
		@FindBy(xpath = "//p[text()='Cash on delivery']")
		private WebElement deliver;
		
		public WebElement getDeliver() {
			return deliver;
		}
		
		
}