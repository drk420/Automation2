package com.Way2automation.Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import com.Way2automation.Testbase.TestBase;

public class Screenshothandling extends TestBase  {

	
	public void takesscreenshothandling(String filename)  {
		
		try {
		TakesScreenshot ts = ((TakesScreenshot)driver);
		File src= ts.getScreenshotAs(OutputType.FILE);
		String path = "D:\\Largest_project\\FlipkartProject\\target\\"+filename+".png";
		File des = new File(path);
			FileHandler.copy(src, des);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

	
	}
