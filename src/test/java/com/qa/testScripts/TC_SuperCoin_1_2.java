package com.qa.testScripts;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_SuperCoin_1_2 extends TestBase{

	
	@Test 
	public void handleWishlist() throws Throwable {
		Thread.sleep(4000);
		String parent = driver.getWindowHandle(); 
		Thread.sleep(6000);
		WebElement login2 = FP_OR.getmouseHowerOnName();
		act.moveToElement(login2).build().perform();
		Thread.sleep(1000); 
		FP_OR.getGoToWishlist().click();
		Thread.sleep(3000);
		
		
		
		
		
	int updatedlWhishList = Integer.parseInt(FP_OR.getWhishListLocator().getText().replaceAll("[^0-9]", ""));
	Thread.sleep(4000); 
	if (updatedlWhishList > 0) { 

		// Assert.assertEquals(updatedlWhishList, initialWhishList + 1);

		System.out.println("There is one item in a cart");
		Thread.sleep(2000); 
		FP_OR.getSelectItemInWishListed().click();
		Thread.sleep(5000);

		// To handle another window 
		Set<String> handle = driver.getWindowHandles();
		System.out.println(handle);
		for (String s : handle) {
			driver.switchTo().window(s);
		}
		FP_OR.getSelectSize().click();
		Thread.sleep(3000); 

		FP_OR.getReadingPower().click();
		// Thread.sleep(3000);

		FP_OR.getBuyNow().click();
		Thread.sleep(3000);

		FP_OR.getDeliverHere().click();
		Thread.sleep(3000);

		FP_OR.getDeliverHereContinue().click();
		Thread.sleep(3000);
		driver.switchTo().window(parent);
		WebElement login1 = FP_OR.getmouseHowerOnLogin();
		act.moveToElement(login1).build().perform();


		// Deleat Wishlist Item 
				FP_OR.getDeleateItemCart().click(); 
				Thread.sleep(3000);
				FP_OR.geCnfrmDeleateItemCart().click();
				Thread.sleep(3000);

				driver.navigate().to("https://www.flipkart.com");

	
	
		
		Thread.sleep(2000);
	} else {
		Assert.assertTrue(false);
		captureScreenShot(driver, "NO ITEM IN WISHLIST");
	}
	
	
	
	}}
