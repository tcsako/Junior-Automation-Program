package com.epam.training.selenium.rc;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;

/**
 * Short example of the old Selenium RC, just to see what a long way Selenium has come over the years.
 * The code could probably be executed, but would most likely fail due to the changed content of the targeted page.
 * You should not use it, since most of it is @Deprecated.
 * 
 * @author Nandor_Rigo
 *
 */

@SuppressWarnings("deprecation")
public class RCDemo {

	public static void main(String[] args) throws InterruptedException {

		// Instatiate the RC Server
		Selenium selenium = new DefaultSelenium("localhost", 4444, "firefox", "http://www.calculator.net");
		selenium.start(); // Start
		selenium.open("/"); // Open the URL
		selenium.windowMaximize();

		// Click on Link Math Calculator
		selenium.click("xpath=.//*[@id='menu']/div[3]/a");
		Thread.sleep(2500); // Wait for page load

		// Click on Link Percent Calculator
		selenium.click("xpath=.//*[@id='menu']/div[4]/div[3]/a");
		Thread.sleep(4000); // Wait for page load

		// Focus on text Box
		selenium.focus("name=cpar1");
		// enter a value in Text box 1
		selenium.type("css=input[name=\"cpar1\"]", "10");

		// enter a value in Text box 2
		selenium.focus("name=cpar2");
		selenium.type("css=input[name=\"cpar2\"]", "50");

		// Click Calculate button
		selenium.click("xpath=.//*[@id='content']/table/tbody/tr/td[2]/input");

		// verify if the result is 5
		String result = selenium.getText(".//*[@id='content']/p[2]");

		if (result == "5") {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
	}
}
