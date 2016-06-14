package com.epam.training.selenium.webdriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * This class represents the different types of element locations. Few examples
 * on how to interact with them and use them in tests.
 * 
 * @author Nandor_Rigo
 */

public class LocalizationAndInteraction {

	public static WebDriver driver = new FirefoxDriver();

	public static void main(String[] args) {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		System.out.println("Test Started");

		driver.get("http://demo.redmine.org/account/register");

		// Calling the test methods for execution.
		interactLoginFieldById();
		interactPasswordFieldInfoByClass();
		interactPasswordFieldByName();
		getAllElementsBasedOnType();
		selectFromDropDown();

		System.out.println("Test Ended");
		
		driver.close();
	}

	public static void interactLoginFieldById() {

		// Locate by ID
		WebElement userLoginField = driver.findElement(By.id("user_login"));

		if (userLoginField.isDisplayed()) {
			userLoginField.sendKeys("Demo");
			System.out.println("Login field modified.");
			userLoginField.clear();
			userLoginField.sendKeys("Second Demo");
		}
	}

	public static void interactPasswordFieldInfoByClass() {

		// Locate by ClassName
		WebElement passwordInfo = driver.findElement(By.className("info"));

		Assert.assertTrue("The info is not present.", passwordInfo.isDisplayed());
		System.out.println("Password info: " + passwordInfo.getText());
	}

	public static void interactPasswordFieldByName() {

		// Locate by ID
		WebElement userLoginField = driver.findElement(By.name("user[password]"));

		if (userLoginField.isDisplayed()) {
			userLoginField.sendKeys("Password");
			System.out.println("Password field modified.");
		}
	}

	public static void getAllElementsBasedOnType() {

		// Locate by custom argument
		List<WebElement> textTypes = driver.findElements(By.cssSelector("input[type='text']"));

		System.out.println("Number of elements found: " + textTypes.size());
		int fieldNumber = 1;
		for (WebElement field : textTypes) {
			field.clear();
			field.sendKeys("This is field No. " + fieldNumber);
			System.out.println("Field value sent to Field " + fieldNumber);
			fieldNumber++;
		}
	}
	
	public static void selectFromDropDown() {
		
		WebElement dropDown = driver.findElement(By.cssSelector("select#user_language"));
		
		Select language = new Select(dropDown);
		language.selectByVisibleText("English (British)");
		language.selectByValue("de");
		System.out.println("Selection finished.");
	}
}
