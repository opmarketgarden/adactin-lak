package com.adactin.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.tools.ant.taskdefs.LoadProperties;
import org.openqa.selenium.WebDriver;


public class ConfigurationReader  {
	public static Properties ps;
	
public ConfigurationReader() throws IOException {
	
File  fss = new File("src\\test\\java\\com\\adactin\\property\\AdactinProperty");
FileInputStream f = new FileInputStream(fss);
ps = new Properties();
ps.load(f);
}

public String getbrowsername() {
	
	String browser = ps.getProperty("browsername");
	return browser;
}

public String geturl() {

	String url = ps.getProperty("url");
	return url;
}

}
