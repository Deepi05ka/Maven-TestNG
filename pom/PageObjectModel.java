package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base_Task;

public class PageObjectModel extends Base_Task {
	
	public PageObjectModel() {
		
		PageFactory.initElements(driver, this);
	}
	
    //WebElement skin = driver.findElement(By.xpath("(//a[text()='skin'])[2]"));
	@FindBy(xpath = "(//a[text()='skin'])[2]")
	private WebElement skin;
	
	//WebElement selcet = driver.findElement(By.xpath("//a[contains(@href,'https://www.nykaa.com/skin/cleansers/face-wash/c/8379')]"));
	@FindBy(xpath ="//a[contains(@href,'https://www.nykaa.com/skin/cleansers/face-wash/c/8379')]")
	private WebElement selcet;
 
	//WebElement facewash = driver.findElement(By.xpath("//div[text()='Nykaa Naturals Face Wash']"));
	@FindBy(xpath = "//div[text()='Nykaa Naturals Face Wash']")
	private WebElement facewash;
	
	//WebElement dropdown = driver.findElement(By.xpath("//select[@title='SHADE']"));
	@FindBy(xpath = "//select[@title='SHADE']")
	private WebElement dropdown;
	
	//WebElement AddtoBag = driver.findElement(By.xpath("(//span[text()='Add to Bag'])[1]"));
	@FindBy(xpath = "(//span[text()='Add to Bag'])[1]")
	private WebElement AddtoBag;
	
	//WebElement bag = driver.findElement(By.xpath("//button[@class='css-aesrxy']"));
	@FindBy(xpath = "//button[@class='css-aesrxy']")
	private WebElement bag;	
	
	//WebElement quanity = driver.findElement(By.xpath("(//span[@class='css-1aowomc ehes2bo0'])[1]"));
	@FindBy(xpath = "(//span[@class='css-1aowomc ehes2bo0'])[1]")
	private WebElement quanity;
	
	//WebElement quanityChoose = driver.findElement(By.xpath("//span[text()='2']"));
	@FindBy(xpath = "//span[text()='2']")
	private WebElement quanityChoose;
	
	//WebElement proceed = driver.findElement(By.xpath("//span[text()='Proceed']"));
	@FindBy(xpath = "//span[text()='Proceed']")
	private WebElement proceed;
	
	//WebElement guest = driver.findElement(By.xpath("//button[text()='Continue as guest']"));
	@FindBy(xpath = "//button[text()='Continue as guest']")
	private WebElement guest;
	
	//WebElement pincode = driver.findElement(By.xpath("//input[@placeholder='Pincode']"));
	@FindBy(xpath = "//input[@placeholder='Pincode']")
	private WebElement pincode;
	
	//WebElement house = driver.findElement(By.xpath("(//input[@type='text'])[3]")); 
	@FindBy(xpath = "(//input[@type='text'])[3]")
	private WebElement house;
	
	//WebElement area = driver.findElement(By.xpath("//textarea[@placeholder='Road Name/ Area /Colony']"));
	@FindBy(xpath = "//textarea[@placeholder='Road Name/ Area /Colony']")
	private WebElement area;
	
	//WebElement name = driver.findElement(By.xpath("//input[@placeholder='Name']"));
	@FindBy(xpath = "//input[@placeholder='Name']")
	private WebElement name;
	
	//WebElement phoneno = driver.findElement(By.xpath("//input[@placeholder='Phone']"));
	@FindBy(xpath = "//input[@placeholder='Phone']")
	private WebElement phoneno;
	
	//WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
	@FindBy(xpath = "//input[@type='email']")
	private WebElement email;
	
	//WebElement shiptotheaddress  = driver.findElement(By.xpath("//button[text()='Ship to this address']"));
	@FindBy(xpath = "//button[text()='Ship to this address']")
	private WebElement shiptotheaddress;
	
	//WebElement deliver = driver.findElement(By.xpath("//p[text()='Cash on delivery']"));
	@FindBy(xpath = "//p[text()='Cash on delivery']" )
	private WebElement deliver;
	
	
	

	

	public WebElement getSkin() {
		return skin;
	}
	
	public WebElement getSelcet() {
		return selcet;
	}
	
	public WebElement getFacewash() {
		return facewash;
	}

	public WebElement getDropdown() {
		return dropdown;
	}

	public WebElement getAddtoBag() {
		return AddtoBag;
	}
    
	public WebElement getBag() {
		return bag;
	}

	public WebElement getQuanity() {
		return quanity;
	}

	public WebElement getQuanityChoose() {
		return quanityChoose;
	}

	public WebElement getProceed() {
		return proceed;
	}

	public WebElement getGuest() {
		return guest;
	}

	public WebElement getPincode() {
		return pincode;
	}

	public WebElement getHouse() {
		return house;
	}

	public WebElement getArea() {
		return area;
	}

	public WebElement getName() {
		return name;
	}

	public WebElement getPhoneno() {
		return phoneno;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getShiptotheaddress() {
		return shiptotheaddress;
	}

	public WebElement getDeliver() {
		return deliver;
	}

	
	
}
