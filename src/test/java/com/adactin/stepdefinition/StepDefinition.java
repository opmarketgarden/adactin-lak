package com.adactin.stepdefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.IOException;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.internal.AbstractParallelWorker.Arguments;

import com.adactin.helper.ConfigurationReader;
import com.adactin.helper.FileReaderManger;
import com.adactin.helper.PageObjectManager;
import com.adactin.pom.BookingPage1;
import com.adactin.pom.BookingPage2;
import com.adactin.pom.Homepage;
import com.adactin.runner.Testrunner;
import com.base.Baseclass;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import junit.framework.Assert;


public class StepDefinition extends Baseclass{
	
	
	
	static WebDriver driver = Testrunner.driver;
	
	
	/*@Before
	public void Beforehooks(cucumber.api.Scenario scenario) {
	String name = scenario.getName();
	System.out.println("scenario"+ name);
	}

	@After
	public void Afterhooks(cucumber.api.Scenario scenario) throws IOException {
	String status = scenario.getStatus();
	System.out.println("scenario"+status);
	if(status.equalsIgnoreCase("failed")){
	getscreenshoot();	
	}
	}*/
	
	@Given("^user launches the application$")
	public void user_launches_the_application() throws Throwable {
	String name =FileReaderManger.getinstance().getCrInstance().getbrowsername();
	bclass("name");    
	driver=getdriver();
	String url = FileReaderManger.getinstance().getCrInstance().geturl();
	getpage(url);
	}

	@When("^userenters the the username in user feild$")
	public void userenters_the_the_username_in_user_feild(){
	WebElement element = PageObjectManager.getinsctance().gethomeepage().getusername();
	setkeys(element,"murugu1957murugu1957" );
	}
	
	@When("^user enters the in the password feild$")
	public void user_enters_the_in_the_password_feild() throws Throwable {
	setkeys(PageObjectManager.getinsctance().gethomeepage().getpassword(),"murugu1412");		  
	}

	@When("^clicks the login button$")
	public void clicks_the_login_button() throws Throwable {
	PageObjectManager.getinsctance().gethomeepage().getloginbtn().click();   
	}

	@Then("^the user verifies the homepage and navigates to the search hotel page$")
	public void the_user_verifies_the_homepage_and_navigates_to_the_search_hotel_page() throws Throwable {
	System.out.println("sucess terminated");
	}
	@Given("^user is in the searchhotel page$")
	public void user_is_in_the_searchhotel_page(){
	dropdown(p.getB1().getLocation(),"text","Sydney");	    
	}

	@When("^user selects datafrom dropdownlist$")
	public void user_selects_datafrom_dropdownlist() throws Throwable {
	dropdown(p.getB1().getHotels(),"index","2"); 
	
	}

	@And("^user enters data in text feild$")
	public void user_enters_data_in_text_feild() {
	dropdown(p.getB1().getRoomtype(),"text","Double");   
	setkeys(p.getB1().getCheckindate(),"07/01/2021");
	setkeys(p.getB1().getCheckoutdate(),"08/01/2021");
	dropdown(p.getB1().getAdultperson(),"index","2");
	dropdown(p.getB1().getChildernnoofperson(),"index","3");
	}

	@And("clicks search button")
	public void clicks_search_button(){
	click(p.getB1().getClck_btn());				    
	}

	@Then("^verify user is in the next feild$")
	public void verify_user_is_in_the_next_feild(){
	driver.getTitle();		    
	}
	@Given("^user is the the bookingpage$")
	public void user_is_the_the_bookingpage() throws Throwable {
	System.out.println("sucess");
	}

	@When("^user is able to select the hotel using radio btn$")
	public void user_is_able_to_select_the_hotel_using_radio_btn() throws Throwable {
	Actions a = new Actions(driver);
	a.moveToElement(p.getB2().getRadiobutton()).click();
	}

	@When("^user is able to selevt subbmit_btn$")
	public void user_is_able_to_selevt_subbmit_btn() throws Throwable {
	Actions a = new Actions(driver);
	a.moveToElement(p.getB2().getCtn_btn()).click();
	}

	@Then("^verify user is able to move to next page$")
	public void verify_user_is_able_to_move_to_next_page() throws Throwable {
	driver.getTitle();    
	}



}
