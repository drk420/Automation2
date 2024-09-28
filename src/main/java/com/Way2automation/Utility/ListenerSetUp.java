package com.Way2automation.Utility;

import org.apache.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.Way2automation.Testbase.TestBase;

public class ListenerSetUp extends TestBase implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		logger.info("Test is started"+result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		logger.info("Test is success"+result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		Screenshothandling b = new Screenshothandling();
		b.takesscreenshothandling(result.getName());
	logger.info("Test is failed"+result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
	logger.info("Test is skipped"+result.getName());
	}


}
