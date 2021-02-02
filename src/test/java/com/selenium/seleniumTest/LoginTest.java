package com.selenium.seleniumTest;

import org.testng.annotations.Test;

import com.selenium.base.BaseTest;

public class LoginTest extends BaseTest {

	LoginPage loginPage;
	
	@Test
	public void login() {
		loginPage = new LoginPage(driver);
		loginPage.login("kushchadha", "ancd1234");
	}

}
