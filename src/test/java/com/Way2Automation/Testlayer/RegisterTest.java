package com.Way2Automation.Testlayer;

import org.testng.annotations.Test;

import com.Way2automation.Pagelayer.Homepage;
import com.Way2automation.Pagelayer.Registrationpage;
import com.Way2automation.Testbase.TestBase;

public class RegisterTest extends TestBase {

	@Test
	public void validateragistrationtest() throws InterruptedException {
		
		Homepage homepage_obj = new Homepage(driver);
		
		homepage_obj.moveover();
		homepage_obj.clickonpractiecewebsitelink();
		
		
		Registrationpage registrationpage_obj = new Registrationpage(driver);
		
		registrationpage_obj.enternametextbox("Dnyaneshwar");
		registrationpage_obj.enterphonetextbox("8788172074");
		registrationpage_obj.enteremailtextbox("drk0870@gmail.com");
		registrationpage_obj.countrydropdown();
		registrationpage_obj.entercitytext("Latur");
		registrationpage_obj.enterusernametextbox("Dnyanu");
		registrationpage_obj.enterpasswordtextbox("Mahadevji@123");
		registrationpage_obj.clickonsubmitbutton();
		registrationpage_obj.clickonpractiecewebsite1();
	//	Thread.sleep(5000);
	//	registrationpage_obj.clickondroppableimg();
	//	Thread.sleep(5000);
	//	registrationpage_obj.elementiframe();
	//	Thread.sleep(5000);
	//	registrationpage_obj.handlingdroppableelement();
		Thread.sleep(5000);
      	registrationpage_obj.clickonresizableimg();
	/////	Thread.sleep(5000);
	//	registrationpage_obj.alerthandling();
		Thread.sleep(5000);
		registrationpage_obj.inputalerthandling();
	}
	
}
