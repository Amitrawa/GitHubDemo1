package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginClass {
	
	WebDriver driver;
	
	@Test
	public void login() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
		
	}

}
