package com.Way2automation.Utility;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.Way2automation.Testbase.TestBase;

public class Dropdownhandling extends TestBase {

	public void dropdownhandling(WebElement element,String elementname) {
		
		Select t = new Select(element);
		
		t.selectByVisibleText(elementname);
		
	List<WebElement> options = t.getOptions();
	int count = options.size();
	logger.info(count);
	
	for(int i=0;i<count;i++) {
		
	String Text	= options.get(i).getText();
		logger.info(Text);
		
	}
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
