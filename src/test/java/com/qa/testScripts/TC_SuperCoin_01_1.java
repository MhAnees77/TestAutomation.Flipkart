package com.qa.testScripts;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.qa.pages.SupercoinPages;
import com.qa.utility.XLUtility;

public class TC_SuperCoin_01_1 extends TestBase {
 
	WebElement login;

	@Test
	public void handleCoin() throws Throwable { 
		
          Thread.sleep(2000); 
        System.out.println("done");
		String parent = driver.getWindowHandle(); 

		// 1.Do Mouse Hower On Profile & Mouse Hower on SuperCoin Zone
		login = FP_OR.getmouseHowerOnName();
		act.moveToElement(login).build().perform();
		Thread.sleep(5000); 
		FP_OR.getsuperCoin().click();
		Thread.sleep(5000); 
		  System.out.println("done2");
		// Verify whether there is superCoin Or not ,If YES Then Proceed
		superCoinCountt = FP_OR.getsuperCoinCount().getText();
		int superCoinCount = Integer.parseInt(superCoinCountt);
		
		
		if (superCoinCount > 0) {
			captureScreenShot(driver, "superCoin");
			Reporter.log("count is :" + superCoinCount + " ====woooooh lets do further actions===");
			FP_OR.getexploreMore().click();
			Thread.sleep(2000);

			Reporter.log("   =======================================================-----------\n");
			// Print all links In this Page
			List<WebElement> allLink = driver.findElements(By.tagName("a"));
			System.out.println("Total links are :" + allLink.size());
			for (int i = 0; i < allLink.size(); i++) {
				System.out.println("Links on pages are :" + allLink.get(i).getAttribute("href") + "<br/>");
				System.out.println("Test on pages are :" + allLink.get(i).getText() + "<br/>");
				Reporter.log("Links on pages are :" + allLink.get(i).getAttribute("href"));
				Reporter.log("Test on pages are :" + allLink.get(i).getText() + "<br/>");

			}
			// Scroll dow using javaScript executor
			Js.executeScript("window.scrollBy(0,200)");
			Thread.sleep(2000);

			/// Select an spex and put into wishList
			FP_OR.getSelectANItemt().click();
			Thread.sleep(3000);  

			String title = FP_OR.getitemNamee().getText();

		 	if (title.contains("Eyewear")) {
				Reporter.log("The Searched Item is: Presesnt ", true);
			} else {
				Reporter.log("The Searched Item is: Not Present", true);
				captureScreenShot(driver, "NO Item found");
				Assert.assertTrue(false, "NO Such Item found");
			}

			// Select one item here
			Js.executeScript("window.scrollBy(0,100)");

			Thread.sleep(10000);
			FP_OR.getAddFavrt().click();
			Thread.sleep(3000);

		// Go to wishList and Verify wishlist Contains Item In It
			login = FP_OR.getmouseHowerOnName();
			act.moveToElement(login).build().perform();
			Thread.sleep(1000); 
			FP_OR.getGoToWishlist().click();
			Thread.sleep(3000); 
	
			driver.navigate().to("https://www.flipkart.com");
			Thread.sleep(3000); 
			
			
			//driver.switchTo().window(parent); 
			
		}			else if (superCoinCount > 500 || superCoinCount <= 0) {
				captureScreenShot(driver, " low supercoin ");
				// SOFT assertion
				sa.assertTrue(false, "Supercoin is less here");


	
	

	 
	
			}
	
	}
}
