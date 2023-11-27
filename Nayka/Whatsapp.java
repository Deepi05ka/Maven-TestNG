package com.Nayka;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Whatsapp {

	static WebDriver driver;
	
	public static void main(String[] args) throws IOException, Exception {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("https://web.whatsapp.com/");
		WebElement code = driver.findElement(By.xpath("//span[text()='Link with QR code']"));
		code.click();
		String  web = driver.findElement(By.xpath("//canvas[@aria-label='Scan me!']")).getAttribute("aria-label");
		URL url = new URL(web);
		BufferedImage image = ImageIO.read(url);
		LuminanceSource source = new BufferedImageLuminanceSource(image);
		BinaryBitmap bitmap = new BinaryBitmap(new HybridBinarizer(source));
		Result results = new MultiFormatReader().decode(bitmap);
		System.out.println(results.getText());
		
		
		

	}

}
