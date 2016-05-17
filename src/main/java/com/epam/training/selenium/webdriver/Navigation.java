package com.epam.training.selenium.webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * The following example demonstrates how to navigate to a page using WebDriver.
 * 
 * @author Nandor_Rigo
 *
 */

public class Navigation {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		// Puts an Implicit wait, Will wait for 10 seconds before throwing
		// exception
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Maximize the browser
		driver.manage().window().maximize();
		
		// Launch websites and navigate between them.
		driver.navigate().to("http://www.epam.com/");
		driver.navigate().refresh();
		driver.get("http://www.istqb.org");
		driver.navigate().back();
		driver.navigate().forward();

		// Print a Log In message to the screen
		System.out.println("The page is loaded.");

		// Closing the browser
		driver.close();
	}
}