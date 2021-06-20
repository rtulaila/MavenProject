package com.ramesh.seleniumPractice.basics.day1;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PageVerification {
	
	String applicationUrl = "http://automationpractice.com/index.php";
	
@Test
	public void myAccountPagevalidation() {
		
		//System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+File.separator+"chromedriver.exe"); 	
	    WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
		Reporter.log("PASS -- Launched Chrome browser successfully", true);

		driver.get(applicationUrl);  //Launch the application
		Reporter.log("PASS -- Application launched successfully", true);
		
		WebElement signInLink = driver.findElement(By.xpath("//a[@class='login']")); //Stores sign in link
		signInLink.click();   //Clicks on the Stored sign in link
		
		WebElement loginPageText = driver.findElement(By.xpath("//h1[@class='page-heading']"));
		String signInText = loginPageText.getText();  //Fetches the text
		String expectedSignInText = "AUTHENTICATION";
		
		Assert.assertEquals(signInText, expectedSignInText, 
				"FAIL -- Log in page did not display successfully"); //Compares the values using TestNG Assertion
		Reporter.log("PASS -- Log in page displayed successfully", true);
		
		WebElement loginModule = driver.findElement(By.xpath("//form[@id='login_form']"));
		loginModule.isDisplayed();  //Verifying whether the webelement is displayed or not
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("testautomation88@test.com");   //Enter the email into the email text box
		WebElement password = driver.findElement(By.id("passwd"));
		password.sendKeys("123456");   //Enter the password into the password text box
		
		WebElement signInButton = driver.findElement(By.id("SubmitLogin"));  //Fetch the webelement
		signInButton.click();  //Click on the Sign in button
		
		driver.findElement(By.xpath("//a[@title='Orders']")).click(); //Click on the order history button
		Reporter.log("PASS --  Click on the Order history button", true);
		String actualOrderHistoryTitle = driver.findElement(By.xpath("//h1[@class='page-heading bottom-indent']")).getText();
		String expectedOrderHistoryTitle = "ORDER HISTORY";
		Assert.assertEquals(actualOrderHistoryTitle, expectedOrderHistoryTitle,"FAIL -- Order History Page title did not match");
		Reporter.log("PASS -- Order History page is displayed successfully");
		driver.findElement(By.xpath("//a[contains(text(),'My account')]")).click();
		Reporter.log("PASS -- Click on the My Account link");
		String actualMyAccountTitle = driver.findElement(By.xpath("//h1[@class='page-heading']")).getText();
		String expectedMyAccountTitle = "MY ACCOUNT";
		Assert.assertEquals(actualMyAccountTitle, expectedMyAccountTitle,"FAIL -- My Account Page title did not match");
		Reporter.log("PASS -- My Account page is displayed successfully");
		
		
		driver.findElement(By.xpath("//a[@title='Credit slips']")).click(); //Click on the My Credit Slips
		Reporter.log("PASS --  Click on the My Credit Slips", true);
		String actualMyCreditSlips = driver.findElement(By.xpath("//h1[@class='page-heading bottom-indent']")).getText();
		String expectedMyCreditSlips = "CREDIT SLIPS";
		Assert.assertEquals(actualMyCreditSlips, expectedMyCreditSlips,"FAIL -- My Credit Slips Page title did not match");
		Reporter.log("PASS -- My Credit Slips page is displayed successfully");
		driver.findElement(By.xpath("//a[contains(text(),'My account')]")).click();
		Reporter.log("PASS -- Click on the My Account link");
		String actualMyAccountTitle1 = driver.findElement(By.xpath("//h1[@class='page-heading']")).getText();
		String expectedMyAccountTitle1 = "MY ACCOUNT";
		Assert.assertEquals(actualMyAccountTitle1, expectedMyAccountTitle1,"FAIL -- My Account Page title did not match");
		Reporter.log("PASS -- My Account page is displayed successfully");
		
		
		driver.findElement(By.xpath("//a[@title='Addresses']")).click(); //Click on the My Address
		Reporter.log("PASS --  Click on the My Address", true);
		String actualMyAddresses = driver.findElement(By.xpath("//h1[@class='page-heading']")).getText();
		String expectedMyAddresses = "MY ADDRESSES";
		Assert.assertEquals(actualMyAddresses, expectedMyAddresses,"FAIL -- My Address Page title did not match");
		Reporter.log("PASS -- My Address page is displayed successfully");
		driver.findElement(By.xpath("//a[contains(text(),'My account')]")).click();
		Reporter.log("PASS -- Click on the My Account link");
		String actualMyAccountTitle2 = driver.findElement(By.xpath("//h1[@class='page-heading']")).getText();
		String expectedMyAccountTitle2 = "MY ACCOUNT";
		Assert.assertEquals(actualMyAccountTitle2, expectedMyAccountTitle2,"FAIL -- My Account Page title did not match");
		Reporter.log("PASS -- My Account page is displayed successfully");
		
							
		driver.findElement(By.xpath("//a[@title='Information']")).click();
		Reporter.log("PASS --  Click on the My Personal Information button", true);
		String actualPersonalInfoTitle = driver.findElement(By.xpath("//h1[@class='page-subheading']")).getText();
		String expectedPersonalInfoTitle = "YOUR PERSONAL INFORMATION";
		Assert.assertEquals(actualPersonalInfoTitle, expectedPersonalInfoTitle,"FAIL -- My Personal Information Page title did not match");
		Reporter.log("PASS -- My Personal information page is displayed successfully");
		driver.findElement(By.xpath("//a[contains(text(),'My account')]")).click();
		Reporter.log("PASS -- Click on the My Account link");
		String actualMyAccountTitle3 = driver.findElement(By.xpath("//h1[@class='page-heading']")).getText();
		String expectedMyAccountTitle3 = "MY ACCOUNT";
		Assert.assertEquals(actualMyAccountTitle3, expectedMyAccountTitle3,"FAIL -- My Account Page title did not match");
		Reporter.log("PASS -- My Account page is displayed successfully");
		
		
		driver.findElement(By.xpath("//a[@title='My wishlists']")).click();
		Reporter.log("PASS --  Click on the MY WISHLISTS", true);
		String actualMyWishLists = driver.findElement(By.xpath("//h1[@class='page-heading']")).getText();
		String expectedMyWishLists = "MY WISHLISTS";
		Assert.assertEquals(actualMyWishLists, expectedMyWishLists,"FAIL -- My Wishlists Information Page title did not match");
		Reporter.log("PASS -- My Wishlists page is displayed successfully");
		driver.findElement(By.xpath("//a[contains(text(),'My account')]")).click();
		Reporter.log("PASS -- Click on the My Account link");
		String actualMyAccountTitle4 = driver.findElement(By.xpath("//h1[@class='page-heading']")).getText();
		String expectedMyAccountTitle4 = "MY ACCOUNT";
		Assert.assertEquals(actualMyAccountTitle4, expectedMyAccountTitle4,"FAIL -- My Account Page title did not match");
		Reporter.log("PASS -- My Account page is displayed successfully");
		
		
		driver.findElement(By.xpath("//a[@class='logout']")).click();   //Logout from the application
		Reporter.log("PASS -- User is logged out successfully", true);
		
		driver.quit();
	}
}