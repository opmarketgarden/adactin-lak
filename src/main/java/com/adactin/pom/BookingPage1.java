package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingPage1 {

	WebDriver driver;
	
	@FindBy(xpath = "//select[@id='location']")
	WebElement Location;
	
	@FindBy(id = "hotels")
	private WebElement Hotels;
	
	@FindBy(id="room_type")
	private WebElement roomtype;
	
	@FindBy(xpath = "//select[@id='room_nos']")
	private WebElement noofrooms;
	
	@FindBy(xpath = "//input[@id='datepick_in']")
	private WebElement checkindate;
	
	@FindBy(xpath = "//input[@class='date_pick']")
	private WebElement checkoutdate;
	
	@FindBy(xpath = "//select[@name='adult_room']")
	private WebElement Adultperson;
	
	@FindBy(xpath = "//select[@id='child_room']")
	private WebElement childernnoofperson;
	
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement clck_btn;
	
	public BookingPage1(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(this.driver,this);
	}
	
	public WebElement getLocation() {
		return Location;
	}
	public WebElement getHotels() {
		return Hotels;
	}
	public WebElement getRoomtype() {
		return roomtype;
	}
	public WebElement getNoofrooms() {
		return noofrooms;
	}
	public WebElement getCheckindate() {
		return checkindate;
	}
	public WebElement getCheckoutdate() {
		return checkoutdate;
	}
	public WebElement getAdultperson() {
		return Adultperson;
	}
	public WebElement getChildernnoofperson() {
		return childernnoofperson;
	}
	public WebElement getClck_btn() {
		return clck_btn;
	}
}
