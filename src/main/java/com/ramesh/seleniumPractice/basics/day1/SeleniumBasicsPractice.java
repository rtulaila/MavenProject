package com.ramesh.seleniumPractice.basics.day1;
import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class SeleniumBasicsPractice {
   
	@Test
	
	public void startSelenium() {
		
	System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+File.separator+"geckodriver.exe");	
	
	WebDriver driver = new FirefoxDriver();
	
	}
}
