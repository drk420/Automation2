package com.Way2automation.Utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.Way2automation.Testbase.TestBase;

public class Moveoveraction extends TestBase {

	public void mouseactions(WebElement element) {
		
		Actions o = new Actions (driver);
		o.moveToElement(element).perform();
		
	}
	public void draganddrophandling(WebElement src,WebElement des) {
		
		Actions o = new Actions (driver);
		o.clickAndHold(src).moveToElement(des).release().build().perform();
		
	}
	
	
}
