package com.base;


import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;import org.w3c.dom.css.ElementCSSInlineStyle;

import com.google.common.io.Files;



public class Baseclass {
	
	public static  WebDriver driver;

	public static void bclass(String Bname) {
	if(Bname.equalsIgnoreCase("chrome"))
    System.setProperty("webdriver.chrome.driver","C:\\Users\\91994\\eclipse-workspace\\Adactin\\Driver\\chromedriver.exe");	
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
	}
	
	public static void getpage(String url) {
	driver.get(url);
	}
	
	public static WebDriver getdriver() {
	return driver;
	}
	
	public static void dropdown(WebElement element,String value,String string) {
	Select s = new Select(element);
	if(value.equalsIgnoreCase("index")) {
	int k=Integer.parseInt(string);	
	s.selectByIndex(k);
	}else if(value.equalsIgnoreCase("string")) {
	s.selectByValue(string);
	}
	else if(value.equalsIgnoreCase("text")) {
	s.selectByVisibleText(string);
	}
			
}
	public static void mouseoverelemnt(WebElement element) {
	Actions a = new Actions(driver);
	if(element.isDisplayed()&&element.isEnabled()) {
	a.moveToElement(element).build().perform();
	}
	}
	
	public String getcurrenturl() {
	String url = driver.getCurrentUrl();
	return url;	
	}
	
	public static void click(WebElement element) {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].click()",element);
	}
	public static void scroll(WebElement element) {
	JavascriptExecutor js =(JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView()",element);
	}
	public static void setkeys(WebElement element,String key) {
    if(element.isDisplayed()&&element.isEnabled()) {
    	element.click();
    	element.clear();
    	element.sendKeys(key);
    }
	}
    public static void getoptions(WebElement element) {
    Select s = new Select(element);
    List<WebElement>options = s.getOptions();
    for (WebElement i : options) {
    System.out.println(i.getText());		
	}
    }
    public static void getscreenshoot() throws IOException {
	TakesScreenshot ts = (TakesScreenshot)driver;
	File screenshot = ts.getScreenshotAs(OutputType.FILE);
    File sfile = new File("C:\\Users\\91994\\eclipse-workspace\\Adactin\\screenshot");
    Files.copy(screenshot,sfile);
	}
	}
	
		

