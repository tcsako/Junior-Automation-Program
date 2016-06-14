package com.epam.training.selenium.webdriver;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * This class represents a Data Driven approach for JUnit tests.
 * Uses a two dimensional String Array as part of a Collection to store the parameter variables used in the test.
 * 
 * The test is going to be executed as many times, as many elements the Array has (in our case 2x)
 * 
 * @author Nandor Rigo
 */
@RunWith(value = Parameterized.class)
public class DataDrivenJunitTest {

	private static WebDriver driver = new FirefoxDriver();

	@Before
	public void setUp() {
		driver.get("http://demo.redmine.org/account/register");
	}
	
	@AfterClass
	public static void tearDown() {
		System.out.println("Test Execution Finished");
		driver.quit();
	}

	private String userName;
	private String password;
	private String firstName;
	private String lastName;
	private String email;
	private String language;

	@Parameters
	public static Collection<String[]> testData() {
		return Arrays.asList(new String[][] {
				{ "DataDriven1", "TesterFName1", "TesterLName1", "email1@email.com", "Data123", "en-GB" },
				{ "DataDriven2", "TesterFName2", "TesterLName2", "email2@email.com", "Data123", "en-GB" }});
	}

	public DataDrivenJunitTest(String userName, String firstName, String lastName, String email, String password,
			String language) {
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.language = language;
	}

	@Test
	public void testRedmineRegistration() throws Exception {

		System.out.println("Test Started");
		
		//driver.navigate().refresh();
		// set user name
		WebElement uName = driver.findElement(By.cssSelector("#user_login"));
		uName.click();
		uName.clear();
		uName.sendKeys(userName);
		System.out.println("User Name: " + userName);

		// set first name
		WebElement fName = driver.findElement(By.cssSelector("#user_firstname"));
		fName.click();
		fName.clear();
		fName.sendKeys(firstName);
		System.out.println("First Name: " + firstName);

		// set last name
		WebElement lname = driver.findElement(By.cssSelector("#user_lastname"));
		lname.click();
		lname.clear();
		lname.sendKeys(lastName);
		System.out.println("Last Name: " + lastName);

		// set email
		WebElement emailAddress = driver.findElement(By.cssSelector("#user_mail"));
		emailAddress.click();
		emailAddress.clear();
		emailAddress.sendKeys(email);
		System.out.println("Email: " + email);

		// set password
		WebElement pass = driver.findElement(By.cssSelector("#user_password"));
		pass.click();
		pass.clear();
		pass.sendKeys(password);
		System.out.println("Password: " + password);

		// set confirm password
		WebElement cPass = driver.findElement(By.cssSelector("#user_password_confirmation"));
		cPass.click();
		cPass.clear();
		cPass.sendKeys(password);

		// select language from drop-down
		WebElement lang = driver.findElement(By.cssSelector("#user_language"));
		Select langSelect = new Select(lang);
		langSelect.selectByValue(language);
		System.out.println("Language: " + language.toUpperCase());

		// click to accept
		/*
		 * Note: this is commented out for a reason, if you want to try it, you
		 * have to create different data in the @code{testData()} method to work
		 * 
		 */
		// WebElement accept = driver.findElement(By.cssSelector("input[type=submit]"));
		// accept.click();
		
		System.out.println("Test Finished");
		System.out.println("");

	}
}
