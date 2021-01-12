package com.adactin.pom;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

public class Homepage {

		WebDriver driver;
		
		@FindBy(xpath="//input[@name='username']")
		private WebElement username;
	  		
		@FindBy(id = "password")
		private WebElement password;
			
		@FindBy(xpath = "//input[@id='login']")
		private WebElement login_btn;
		
		
		public Homepage(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(this.driver,this);
		}

		public WebElement getusername() {
		return username;
		}
		
		public WebElement getpassword() {
		return password;
		}
		
		public WebElement getloginbtn() {
		return login_btn;
		}
		
				
	}



