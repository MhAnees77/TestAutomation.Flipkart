package com.qa.testScripts;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.qa.pages.HomePageValidationPages;

public class TC_HomePageValidation_01 extends TestBase {

	private int initialWhishList = 0;

	@Test
	public void handleElectronics() throws InterruptedException, IOException {

		String currentUrl = driver.getCurrentUrl();

		String expUrl = "https://www.flipkart.com/";
		if (currentUrl.equals(expUrl)) {
			System.out.println("User is in Home page");
			Reporter.log("User is in Home page");
			Assert.assertEquals(expUrl, currentUrl);
			Thread.sleep(4000);
		} else {
			Assert.assertTrue(false);
			captureScreenShot(driver, "Validation fails");
		}

	}
}
