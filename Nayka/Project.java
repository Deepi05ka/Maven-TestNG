package com.Nayka;

import com.base.Base_Task;
import com.pom.PageObjectManager;

public class Project extends Base_Task {
	
	public static void demo() throws InterruptedException {
		browserLaunch("chrome");
		LaunchUrl("https://www.nykaa.com/");
		getTitle();
		
		PageObjectManager pom = new PageObjectManager();
		implictWait();
		
		Actions(pom.getOrder().getSkin(), "movetoelement");
		clickonElement(pom.getOrder().getSelcetFaceWash());
		getWindowHandles();
		clickonElement(pom.getOrder().getFaceWash());
		getWindowHandles("getAllTitle");
		DropDownVisibleText(pom.getOrder().getDropdown(), "500ml");
		clickonElement(pom.getOrder().getAddtoBag());
		clickonElement(pom.getOrder().getBag());
		frame(0);
		clickonElement(pom.getOrder().getProceed());
		clickonElement(pom.getOrder().getGuest());
		sendKeys(pom.getProceed().getPincode(), "602001");
		Thread.sleep(3000);
		clickonElement(pom.getProceed().getHouse());
		Thread.sleep(5000);
		sendKeys(pom.getProceed().getHouse(), "21b");
		sendKeys(pom.getProceed().getArea(), "vk nager");
		sendKeys(pom.getProceed().getName(), "Deepika");
		sendKeys(pom.getProceed().getPhoneno(), "9924562894");
		sendKeys(pom.getProceed().getEmail(), "deepika123@gmail.com");
		clickonElement(pom.getProceed().getShiptotheaddress());
		clickonElement(pom.getProceed().getDeliver());
		
	}

	public static void main(String[] args) throws InterruptedException {
		demo();
	}

}
