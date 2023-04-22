package com.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pages.Baseclass;
import com.pages.LoginPage;
import com.utility.BrowserFactory;

public class Login extends Baseclass {

	// abstraction:- shpwing the essential deatils and hiding the uneccassary
	// details

//	@BeforeTest
//	public void setup() {
//		driver = BrowserFactory.startApplication(driver, "Chrome", "https://www.saucedemo.com/");
//	}

	@Test
	public void loginApp() {

		logger = report.createTest("Login to SauceDemo");

		// it will go to the login page it will cjheck all the locators it will
		// initialize and it will return all the object

		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

		logger.info("Starting  Application");
		loginPage.loginToSaucedemo("standard_user", "secret_sauce");

		logger.pass("Login Done Successfully");

	}

//	@AfterTest
//	public void teardown() {
//		BrowserFactory.quitBrowser(driver);
//	}

}
