package com.selenium.seleniumTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {
	
	@FindBy(xpath = "//input[@type='email']")
	WebElement email;
	
	@FindBy(xpath = "//div[@class='VfPpkd-RLmnJb']")
	WebElement nextButton;
	
	@FindBy(xpath = "//input[@type='password']")
	WebElement password;
	
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	
	public void login(String userName, String pass) {
		email.sendKeys(userName);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		nextButton.click();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		password.sendKeys(pass);
		nextButton.click();
	}

}
