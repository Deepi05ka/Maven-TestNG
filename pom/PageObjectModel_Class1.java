package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base_Task;

public class PageObjectModel_Class1 extends Base_Task {
	
	public PageObjectModel_Class1() {
		PageFactory.initElements(driver, this);
	}
	
	 //WebElement skin = driver.findElement(By.xpath("(//a[text()='skin'])[2]"));
		@FindBy(xpath = "(//a[text()='skin'])[2]")
		private WebElement skin;
		
		public WebElement getSkin() {
			return skin;
		}
		
		//WebElement selcetFaceWash = driver.findElement(By.xpath("//a[contains(@href,'https://www.nykaa.com/skin/cleansers/face-wash/c/8379')]"));
		@FindBy(xpath ="//a[contains(@href,'https://www.nykaa.com/skin/cleansers/face-wash/c/8379')]")
		private WebElement selcetFaceWash;
		
		public WebElement getSelcetFaceWash() {
			return selcetFaceWash;
		}
		
		//WebElement FaceWash = driver.findElement(By.xpath("//div[text()='Cetaphil Gentle Skin Cleanser']"));
		@FindBy(xpath = "//div[text()='Cetaphil Gentle Skin Cleanser']")
		private WebElement FaceWash;
		
		public WebElement getFaceWash() {
			return FaceWash;
		}
		
		//WebElement dropdown = driver.findElement(By.xpath("//select[@title='SIZE']"));
		@FindBy(xpath = "//select[@title='SIZE']")
		private WebElement dropdown;
		
		public WebElement getDropdown() {
			return dropdown;
		}
		
		//WebElement AddtoBag = driver.findElement(By.xpath("(//span[text()='Add to Bag'])[1]"));
		@FindBy(xpath = "(//span[text()='Add to Bag'])[1]")
		private WebElement AddtoBag;
		
		public WebElement getAddtoBag() {
			return AddtoBag;
		}
		
		//WebElement bag = driver.findElement(By.xpath("//button[@class='css-aesrxy']"));
		@FindBy(xpath = "//button[@class='css-aesrxy']")
		private WebElement bag;	
		
		public WebElement getBag() {
			return bag;
		}
		
		//WebElement proceed = driver.findElement(By.xpath("//span[text()='Proceed']"));
		@FindBy(xpath = "//span[text()='Proceed']")
		private WebElement proceed;
		
		public WebElement getProceed() {
			return proceed;
		}
		
		//WebElement guest = driver.findElement(By.xpath("//button[text()='Continue as guest']"));
		@FindBy(xpath = "//button[text()='Continue as guest']")
		private WebElement guest;
		
		public WebElement getGuest() {
			return guest;
		}
		
		
}
