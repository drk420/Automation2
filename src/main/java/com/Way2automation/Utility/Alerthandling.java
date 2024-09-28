package com.Way2automation.Utility;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;

import com.Way2automation.Testbase.TestBase;

public class Alerthandling extends TestBase {

	
	public void alerthandling() {
		
		Alert o = driver.switchTo().alert();
		o.accept();
	String text	= o.getText();
	logger.info(text);
	}
	
	public void inputalerthandling(String text) {
		Alert o = driver.switchTo().alert();
		o.sendKeys(text);
		o.accept();
		
		
		
	}
	
	
	
	
	
	
	
}
