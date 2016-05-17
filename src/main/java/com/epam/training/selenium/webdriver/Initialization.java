package com.epam.training.selenium.webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * The following example demonstrates how to initialize a WebDriver instance.
 * This piece of code opens a Firefox instance, puts it to full screen and closes it after.
 * 
 * @author Nandor_Rigo
 *
 */

public class Initialization {
	
	public static void main(String[] args) {
		   
	      WebDriver driver = new FirefoxDriver();
	      //Puts an Implicit wait, Will wait for 10 seconds before throwing exception
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      
	      //Here comes the Test code. Only a bit later.
	      
	      //Maximize the browser
	      driver.manage().window().maximize();
	      
	      //Closing the browser
	      driver.close();
	}
}
