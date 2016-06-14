package com.epam.training.selenium.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * This class shows us how to use parameters as test data through an easy example.
 *  
 * @author Nandor Rigo
 */
public class ParameterizedTest {

	public static WebDriver driver = new FirefoxDriver();
	
	public static void main(String[] args) {
		
		driver.get("http://www.google.com");
		parameterizedTest("Parameterized Test", "Parameterized Test");
		driver.quit();
	}
	
	/**
	 * The method expects us to provide two string variables which will be used in the test.
	 * 
	 * @param searchString
	 * @param pageTitle
	 */
	public static void parameterizedTest(String searchString, String pageTitle) {

		// Enter the search string and send it
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys(searchString);
		element.submit();
		String browserTitle = driver.getTitle();

		// Check the title of the page
		if (browserTitle.contains(pageTitle)) {
			System.out.println("Page title is " + pageTitle + ", as expected");
		} else {
			System.out.println("Expected page title was " + pageTitle + ", but was " + driver.getTitle() + " instead");
		}
	}
}
