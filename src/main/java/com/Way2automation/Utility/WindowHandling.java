package com.Way2automation.Utility;

import java.util.ArrayList;
import java.util.Set;

import com.Way2automation.Testbase.TestBase;

public class WindowHandling extends TestBase{

	
	public void windowhandling(int id) {
		String parentid= driver.getWindowHandle();
		Set<String>parentandchildid = driver.getWindowHandles();
		
		ArrayList<String> i  = new ArrayList(parentandchildid);
		
		driver.switchTo().window(i.get(1));
	}
	
	}
