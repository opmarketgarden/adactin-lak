package com.adactin.helper;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.adactin.pom.BookingPage1;
import com.adactin.pom.BookingPage2;
import com.adactin.pom.Homepage;
import com.base.Baseclass;

public class PageObjectManager extends Baseclass{
	
	public static WebDriver driver;
	
	private PageObjectManager(){
	}
	
	public static PageObjectManager getinsctance() {
		PageObjectManager p = new PageObjectManager();
		return p;
	}
	
	private Homepage hp = new Homepage(driver);
	private BookingPage1 b1 = new BookingPage1(driver);
	private BookingPage2 b2= new BookingPage2(driver);
	
	public BookingPage1 getB1() {
	return b1;
	}
	public BookingPage2 getB2() {
	return b2;
	}
	public Homepage gethomeepage() {
	return hp;
	}
	public PageObjectManager(WebDriver driver) {
	this.driver = driver;
	}
	
	
}
