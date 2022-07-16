package com.regression.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest1 {

	@Test
	public void startbrowser() {

		WebDriverManager.chromedriver().setup();
		//WebDriverManager.chromedriver().

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Assert.assertTrue(driver.getTitle().contains("Orange"), "This title doesnot match");
		driver.quit();

		/*
		 * ChromeOptions Options = new ChromeOptions();
		 * Options.addArguments("-headless"); WebDriverManager.chromedriver().setup();
		 * WebDriver driver = new ChromeDriver(Options);
		 * driver.get("https://www.google.co.in/");
		 * //driver.navigate().to("www.google.com");
		 * System.out.println("DONE###########");
		 */

	}
}
