package com.Way2automation.Testbase;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class TestBase {
	
	public static Logger logger;
	public static WebDriver driver;
	
	@BeforeTest
	public void start() {
		
		logger = Logger.getLogger("Way2AutomationFramework");
		PropertyConfigurator.configure("Log4jproperties.File");
		logger.info("FrameworkStarted");
		}
	
	@AfterTest
	public void end() {
		logger.info("Framework Closed");
	}
	
	@BeforeMethod
	public void setup() {
		String br = "Chrome";
		if(br.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
			
		}
		else if(br.equalsIgnoreCase("EdgeDriver")){
			driver = new EdgeDriver();
		}
		else if(br.equalsIgnoreCase("firefox")) {
			
			driver = new FirefoxDriver();
			
		}
		else {
			logger.info("Provide correct browser name");
		}
		driver.get("https://www.way2automation.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
		logger.info("browser is lauched with website,coockies are deleted");
		
	}
	
	@AfterMethod
	public void close() {
		driver.quit();
		logger.info("all windows are closed");
	}
	
	
	
	

}
