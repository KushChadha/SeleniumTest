package com.selenium.seleniumTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testing {
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("before test");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("before method");
	}
	
	@Test(priority = 1)
	public void scenario1() {
		System.out.println("scenario1");
	}
	
	@Test(priority = 0)
	public void scenario3() {
		System.out.println("scenario3");
	}
	
	
	@AfterTest
	public void afterTest() {
		System.out.println("after test");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("after method");
	}

}
