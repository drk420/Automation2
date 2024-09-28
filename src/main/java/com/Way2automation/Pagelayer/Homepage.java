package com.Way2automation.Pagelayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Way2automation.Testbase.TestBase;
import com.Way2automation.Utility.Moveoveraction;

public class Homepage extends TestBase {

	
	public Homepage(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(xpath="//header/div[@id='ast-desktop-header']/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/nav[1]/div[1]/ul[1]/li[4]/a[1]/span[2]")
	private WebElement Resources_element;
	
	@FindBy(xpath="//header/div[@id='ast-desktop-header']/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/nav[1]/div[1]/ul[1]/li[4]/ul[1]/li[1]/a[1]/span[2]")
	private WebElement practiecewebsites_link;
	
	
	
	
	public void moveover() {
		Moveoveraction u = new Moveoveraction();
		u.mouseactions(Resources_element);
		
	}
	
	public void clickonpractiecewebsitelink() {
	
	practiecewebsites_link.click();
	
	
	}
}
