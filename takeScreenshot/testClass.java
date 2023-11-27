package takeScreenshot;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({ItestListner.class})
public class testClass extends BaseTest {

	@Test
	public void google() throws InterruptedException {
		
		driver.get("https://www.google.com/");
		driver.findElement(By.id("q")).sendKeys("Red rose",Keys.ENTER);
		String Ex ="Red rose - Google Search";
		String ac = driver.getTitle();
		assertEquals(ac, Ex,"title mismatch");
		
	}
	@Test
public void flipkart() throws InterruptedException {
	
	driver.get("https://www.facebook.com/");
	driver.findElement(By.id("email")).sendKeys("deepi@123",Keys.ENTER);
	
	
	}
	@Test
public void OrangeHrm() throws InterruptedException {
	
	driver.get("https://opensource-demo.orangehrmlive.com");
	driver.findElement(By.name("username")).sendKeys("Admin");
	driver.findElement(By.name("password")).sendKeys("admin123");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
}
}
