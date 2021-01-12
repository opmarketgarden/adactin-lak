package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingPage2 {
	
	WebDriver driver;
	
	@FindBy(xpath = "//input[@id='continue']")
    private WebElement ctn_btn;
    
	@FindBy(id="radiobutton_0")
    private WebElement radiobutton;
	
    public BookingPage2(WebDriver driver2) {
	PageFactory.initElements(driver,this);
	this.driver=driver;
	}
    public WebElement getRadiobutton() {
	return radiobutton;
	}
    public WebElement getCtn_btn() {
	return ctn_btn;
	}
    
   
}
