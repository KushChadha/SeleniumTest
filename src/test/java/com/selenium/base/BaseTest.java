package com.selenium.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class BaseTest {
	
	public WebDriver driver;
	
	@BeforeSuite
	public void setup() {
		System.out.println("hello");
//		System.setProperty("webdriver.chrome.driver", "/seleniumTest/chromedriver");
		WebDriverManager.chromiumdriver().setup();
//		ChromeDriverManager.chromedriver();
		driver = new ChromeDriver();
		driver.get("https://www.gmail.com");
	}
	
}
