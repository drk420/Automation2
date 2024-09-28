package com.Way2automation.Pagelayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Way2automation.Testbase.TestBase;
import com.Way2automation.Utility.Alerthandling;
import com.Way2automation.Utility.Dropdownhandling;
import com.Way2automation.Utility.IFrameHandling;
import com.Way2automation.Utility.Moveoveraction;
import com.Way2automation.Utility.SizeHandling;
import com.Way2automation.Utility.WindowHandling;

public class Registrationpage extends TestBase {

	
	public Registrationpage(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/fieldset[1]/input[1]")
	private WebElement name_textbox;
	
	@FindBy(xpath="//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/fieldset[2]/input[1]")
	private WebElement phone_textbox;
	
	@FindBy(xpath="//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/fieldset[3]/input[1]")
	private WebElement email_textbox;
	
	@FindBy(xpath="//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/fieldset[5]/input[1]")
	private WebElement city_textbox;
	
	@FindBy(xpath="//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/fieldset[6]/input[1]")
	private WebElement username_textbox;
	
	@FindBy(xpath="//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/fieldset[7]/input[1]")
	private WebElement password_textbox;
	
	@FindBy(xpath="//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/input[1]")
	private WebElement submit_button;
	
	@FindBy(xpath="//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/fieldset[4]/select[1]")
	private WebElement country_dropdown;
	
	@FindBy(xpath="//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/p[1]/a[1]")
	private WebElement practicewebsite1_link;
	
	@FindBy(xpath="//body/section[@id='wrapper']/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]/figure[1]/img[1]")
	private WebElement droppable_img;
	
	@FindBy(xpath="//body/section[@id='wrapper']/div[1]/div[1]/div[3]/div[1]/div[1]/iframe[1]")
	private WebElement element_iframe;
	
	@FindBy(xpath="//div[@id='draggable']")
	private WebElement src_element;
	
	@FindBy(xpath="//div[@id='droppable']")
	private WebElement des_element;
	
	@FindBy(xpath="/html[1]/body[1]/section[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/a[1]/figure[1]/img[1]")
	private WebElement resizable_img;
	
	@FindBy(xpath="//body/section[@id='wrapper']/div[1]/div[1]/div[3]/div[1]/div[1]/iframe[1]")
	private WebElement resizable_iframe;
	
	@FindBy(xpath="//div[@id='resizable']")
	private WebElement resizable_element;
	
	@FindBy(xpath="//body/section[@id='wrapper']/nav[@id='main-nav']/div[1]/ul[1]/li[7]/a[1]")
	private WebElement alert_button;
	
	@FindBy(xpath="//body/section[@id='wrapper']/div[1]/div[1]/div[3]/div[1]/div[1]/iframe[1]")
	private WebElement alert_iframe;
	
	@FindBy(xpath="//button[contains(text(),'Click the button to display an alert box:')]")
	private WebElement simple_alert;
	
	@FindBy(xpath="//a[contains(text(),'Input Alert')]")
	private WebElement inputalert_button;
	
	@FindBy(xpath="//body/section[@id='wrapper']/div[1]/div[1]/div[3]/div[2]/div[1]/iframe[1]")
	private WebElement inputalert_iframe;
	
	@FindBy(xpath="//button[contains(text(),'Click the button to demonstrate the Input box.')]")
	private WebElement inputalert_button1;
	
	public void enternametextbox(String name) {
		name_textbox.sendKeys(name);
		
		
	}
	
	public void enterphonetextbox(String phone) {
		
		phone_textbox.sendKeys(phone);
	}
	
	public void enteremailtextbox(String email) {
		
		email_textbox.sendKeys(email);
	}
	
	public void entercitytext(String city) {
		
		city_textbox.sendKeys(city);
		
	}
	
	public void enterusernametextbox(String username) {
		
		
		username_textbox.sendKeys(username);
	}
	
	public void enterpasswordtextbox(String password) {
		
		password_textbox.sendKeys(password);
		
	}
	
	public void clickonsubmitbutton() {
		submit_button.click();
		
	}
	
	public void countrydropdown() {
		
		Dropdownhandling g = new Dropdownhandling();
		g.dropdownhandling(country_dropdown,"India");
	}
	
	public void clickonpractiecewebsite1() {
		
		practicewebsite1_link.click();
		
	}
	
	public void clickondroppableimg() {
		
		droppable_img.click();
		
	}
	
	
	public void elementiframe() {
		WindowHandling h = new WindowHandling();
		h.windowhandling(1);
		IFrameHandling n = new IFrameHandling();
		n.iframehandling(element_iframe);
		
	}
	
	public void handlingdroppableelement() {
		
		Moveoveraction j = new Moveoveraction();
		j.draganddrophandling(src_element, des_element);
		
	}
	
	public void clickonresizableimg() throws InterruptedException {
		
		
		resizable_img.click();
		Thread.sleep(5000);
		WindowHandling h = new WindowHandling();
		h.windowhandling(1);
	//	Thread.sleep(5000);
	//	IFrameHandling n = new IFrameHandling();
	//	n.iframehandling(resizable_iframe);
	//	Thread.sleep(5000);
	//	SizeHandling p = new SizeHandling();
	//	p.sizehandling(600, 700);
		
	//	driver.manage().window().maximize();
		
		
	}
	public void alerthandling() throws InterruptedException {
		Thread.sleep(5000);
		alert_button.click();
		IFrameHandling n = new IFrameHandling();
		n.iframehandling(alert_iframe);
		Thread.sleep(5000);
		simple_alert.click();
		Thread.sleep(5000);
		Alerthandling h = new Alerthandling();
		h.alerthandling();
		
		
	}
	public void inputalerthandling() throws InterruptedException {
		Thread.sleep(5000);
		alert_button.click();
		Thread.sleep(5000);
		inputalert_button.click();
		Thread.sleep(5000);
		IFrameHandling n = new IFrameHandling();
		n.iframehandling(inputalert_iframe);
		Thread.sleep(5000);
		inputalert_button1.click();
		Thread.sleep(5000);
		Alerthandling h = new Alerthandling();
		h.inputalerthandling("alert is handled");
		
		
	}
	}
