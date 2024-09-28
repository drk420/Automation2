package com.Way2automation.Utility;

import org.openqa.selenium.Dimension;

import com.Way2automation.Testbase.TestBase;

public class SizeHandling extends TestBase {

	
	public void sizehandling(int x,int y) {
		
		Dimension o = driver.manage().window().getSize();
		logger.info(o);
		
		Dimension g = new Dimension(x,y);
		driver.manage().window().setSize(g);
	}
	}
