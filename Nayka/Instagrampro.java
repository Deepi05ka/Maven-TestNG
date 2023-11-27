package com.Nayka;

import com.base.Base_Task;
import com.pom.PageObjectManager;

public class Instagrampro extends Base_Task {

	
	public static void demo() {
		PageObjectManager b = new PageObjectManager();
		browserLaunch("chrome");
		LaunchUrl("https://www.instagram.com/");
		sendKeys(b.getInstaLogin().getPhoneno(), "7708038495");
		sendKeys(b.getInstaLogin().getPassword(), "Deepika@123");
		clickonElement(b.getInstaLogin().getLogin());
	}
 public static void main(String[] args) {
	 demo();
 }
}
