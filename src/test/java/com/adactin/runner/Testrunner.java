package com.adactin.runner;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactin.helper.ConfigurationReader;
import com.adactin.helper.FileReaderManger;
import com.aventstack.extentreports.gherkin.model.Scenario;
import com.base.Baseclass;

import cucumber.api.CucumberOptions;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/com/adactin/feature/Adactin.feature",
                  glue="com\\adactin\\stepdefinition",
                  monochrome = true,
                  dryRun = false,
                  strict = true,
                  tags = {"@smoke"})

public class Testrunner {

public static WebDriver driver;

@BeforeClass
public static void setup() throws IOException {
Baseclass b = new Baseclass();
String Browser = FileReaderManger.getinstance().getCrInstance().getbrowsername();
b.bclass(Browser);
driver = Baseclass.driver;
}

/*@AfterClass
public static void teardown() throws InterruptedException {

driver.close();

}*/
}


