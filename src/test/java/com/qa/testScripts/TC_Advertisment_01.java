package com.qa.testScripts;

import java.awt.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.pages.AdvertisementPages;
import com.qa.utility.XLUtility;
import com.qa.pages.HomePageValidationPages;

public class TC_Advertisment_01 extends TestBase {

	@Test
	public void handleAdvertisement() throws Throwable {

		Thread.sleep(2000);
		WebElement elem = Flipsearch.getAdvertise();
		Js.executeScript("arguments[0].scrollIntoView()", elem);
		elem.click();
		Thread.sleep(2000);

		// add assert here to make sure that landed on brandpulse page
		String title = Flipsearch.getBrandText().getText();

		if (title.contains("Brand Pulse")) {
			Reporter.log("The Searched Item is: Presesnt ", true);

			Flipsearch.getSearchBox().sendKeys(prop.getProperty("Brand1"));
			Thread.sleep(5000);
			Flipsearch.getsearchbutton().click();
			Thread.sleep(5000);

			Flipsearch.getaddbrand().click();
			Flipsearch.getSearchBox().sendKeys(prop.getProperty("Brand2"));
			Thread.sleep(5000);
			Flipsearch.getsearch().click();

			driver.navigate().to("https://www.flipkart.com");
			Thread.sleep(3000);

		} else {
			Reporter.log("The Searched Item is: Not Present", true);
			captureScreenShot(driver, "Page NOT Found");
			Assert.assertTrue(false, "Page NOT Found");
		}

	}
}
