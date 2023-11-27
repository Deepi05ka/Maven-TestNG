
package com.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Task {
	
	public static WebDriver driver;
	

	public static void browserLaunch(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
		    driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		}
		else if(browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
		    driver = new EdgeDriver();
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		  }
		}
	
	
	public static void LaunchUrl(String url) {
		driver.get(url);
	}
	
	public static void getTitle() {
		String title = driver.getTitle();
		System.out.println("Title : "+title);
		}
	
	public static void getcurrentUrl() {
		String currenturl = driver.getCurrentUrl();
		System.out.println("getcurrenturl: "+currenturl);
	}
	
    public static void getText(WebElement element) {
		String e =element.getText();
		System.out.println("getText :"+ e);
		}
    
    public static void getallText(List<WebElement> element) {
    	for(WebElement all :element) {
    		System.out.println("get all text :"+all.getText());
    	}
    }
    
    
    public static void getAttribute(WebElement element,String value) {
    	String a =element.getAttribute(value);
    	System.out.println("getAttribute :"+a);
    }
    
    
    public static void navigateTo(String Url) {
    	driver.navigate().to(Url);
    }
    
    public static void navigateback() {
    	driver.navigate().back();
    }
    
    public static void navigateforward() {
    	driver.navigate().forward();
    	
    }
    
    public static void navigaterefers() {
    	driver.navigate().refresh();
    }
    
    public static void isDisplayed(WebElement element) {
    	boolean b =element.isDisplayed();
    	System.out.println("isDisplayed :"+b);
    	
    }
    
    public static void isEnable(WebElement element) {
    	boolean b =element.isEnabled();
    	System.out.println("isEnable: "+b);
    	
    }
    
    public static void isSelected(WebElement element) {
    	boolean b =element.isSelected();
    	System.out.println("isSelected: "+b);
    	
    }
    
	public static void screenshot(String name) {
		TakesScreenshot ts = (TakesScreenshot)driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
		File Dest = new File("C:\\Users\\lenovo\\eclipse-workspace\\Maven\\snap\\"+name+".png");
		try {
			FileHandler.copy(source, Dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void sendKeys(WebElement element,String value) {
		
		element.sendKeys(value);
	}
	
	public static void clickonElement(WebElement element) {
		
		element.click();
	}
	
	public static void Actions(WebElement element,String options) {
		 Actions act = new Actions(driver);
		
		 if(options.equalsIgnoreCase("click")) {
			 act.click(element).perform();
		 }
		 
		 else if(options.equalsIgnoreCase("moveToElement")) {
	     act.moveToElement(element).perform();
	     } 
		 else if(options.equalsIgnoreCase("doubleclick")) {
			 act.doubleClick(element).perform();
		 }
		 else if(options.equalsIgnoreCase("rightclick")) {
			 act.contextClick(element).perform();
		 }
		 else if(options.equalsIgnoreCase("clickandHold")) {
			 act.clickAndHold(element).perform();
		 }
   }
	
    public static void DragandDrop(WebElement drag, WebElement drop) {
    	Actions act = new Actions(driver);
    	act.dragAndDrop(drag, drop);
  }
	
	
	public static void getWindowHandles() {
		Set<String> windowHandle = driver.getWindowHandles();
        for(String newWindow : windowHandle){
        	driver.switchTo().window( newWindow);
        }
	}
	
	public static void getWindowHandles(String values) {
		if(values.equalsIgnoreCase("getAllTitle")) {
		Set<String> windowHandle = driver.getWindowHandles();
        for(String singleWindow : windowHandle){
        	System.out.println(driver.switchTo().window(singleWindow).getTitle());
        }
	  }
	}
	
	
	public static void DropDownIndex(WebElement element, int n) {
		Select ref = new Select(element);
		ref.selectByIndex(n);
		} 
	
	public static void DropDownvalue(WebElement element, String value) {
		Select ref = new Select(element);
		ref.selectByValue(value);
		} 
	
	
	public static void DropDownVisibleText(WebElement element, String name) {
		Select ref = new Select(element);
		ref.selectByVisibleText(name);
		} 
	
	public static void isMultiple(WebElement element) {
		Select ref = new Select(element);
		boolean multiple = ref.isMultiple();
		System.out.println("is Multiple : "+multiple);
		}
	
	public static void getOptions(WebElement element) {
		Select ref = new Select(element);
		List<WebElement> alloptions = ref.getOptions();
		for(WebElement singleoptions : alloptions) {
			System.out.println("Get all options: "+singleoptions.getText());
		}
	}
	
	
	public static void selectOptions(WebElement element,String options ) {
		if(options.equalsIgnoreCase("first")) {
		Select ref = new Select(element);
		WebElement firstselect = ref.getFirstSelectedOption();
		System.out.println("Get First select options : "+firstselect.getText());
		}
		if(options.equalsIgnoreCase("All")) {
			Select ref = new Select(element);
			List<WebElement> Allselect = ref.getAllSelectedOptions();
			for(WebElement singleSelect : Allselect)
			System.out.println("Get All select options : "+singleSelect.getText());
			}
	}
	
	 
	public static void close() {
		driver.close();
		}
	
	
	public static void quit() {
		driver.quit();
	}
	
	
	public static void AlertAccept() {
		driver.switchTo().alert().accept();
	}
	
	
	public static void AlertDismiss() {
		driver.switchTo().alert().dismiss();
	}
	
	public static void AlertsendKeys(String name) {
		driver.switchTo().alert().sendKeys(name);
	}
	
	
	public static void frame(int n) {
		
			driver.switchTo().frame(n);
		}
	
	public static void frame(String name) {
		
			driver.switchTo().frame(name);
		}
	
	public static void frame(WebElement element) {
		
			driver.switchTo().frame(element);
		}
	
		
	public static void implictWait() {
		
		 driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		}
	
	public static void ExplictyWait(WebElement element, String options) {
		
			WebDriverWait wait = new WebDriverWait(driver, 50);
			
		    if(options.equalsIgnoreCase("Element visibilityOff")) {
			wait.until(ExpectedConditions.visibilityOf(element));
	        }
		    else if(options.equalsIgnoreCase("ElementToBeClicked")) {
			wait.until(ExpectedConditions.elementToBeClickable(element));
	        }
		    else if(options.equalsIgnoreCase("ElementToBeSelected")) {
				wait.until(ExpectedConditions.elementToBeSelected(element));
		        }
		   }
	
	public static void Fluent() {
		
	}
	
	public static void RobotClass(String options) throws AWTException {
		Robot r = new Robot();
		if(options.equalsIgnoreCase("PressEnter")) {
			r.keyPress(KeyEvent.VK_ENTER);
			}
		else if(options.equalsIgnoreCase("ReleaseEnter")) {
			r.keyRelease(KeyEvent.VK_ENTER);
		}
		else if(options.equalsIgnoreCase("PressDown")) {
			r.keyPress(KeyEvent.VK_DOWN);
		}
		else if(options.equalsIgnoreCase("Presscontrol")) {
			r.keyPress(KeyEvent.VK_CONTROL);
		}
		else if(options.equalsIgnoreCase("Releasecontrol")) {
			r.keyRelease(KeyEvent.VK_CONTROL);
		}
		else if(options.equalsIgnoreCase("delay")) {
			r.delay(3000);
		}
		
	}
	
	public static void checkbox(WebElement element) {
		element.click();
		
	}
	
	public static void scrollDown(WebElement element ) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()", element);
		
	}
	
	public static void scrollDown(WebElement element , String options ) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		if(options.equalsIgnoreCase("scrolldown")) {
			js.executeScript("window.scrollBy(0,2000)");
		}
		if(options.equalsIgnoreCase("scrollup")) {
			js.executeScript("window.scrollBy(0,-2000)");
		}
		
	}
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
  

