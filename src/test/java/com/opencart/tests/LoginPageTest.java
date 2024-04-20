package com.opencart.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginPageTest {

	WebDriver driver = null;
	
	@Parameters({"url","browser"})
	@Test
	public void startBrowser(String url, String browserName) {
		
		
		switch (browserName.toLowerCase().trim()) {
		case "chrome":
			driver =  new ChromeDriver();
			break;

		case "firefox":
			driver = new FirefoxDriver();
			break;
			
		default:
			System.out.println("Please enter the right browser name");
		}
		
		driver.get(url);
		driver.manage().window().maximize();
		driver.close();
	}
}
