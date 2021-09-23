package com.qa.testScripts;

import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.pages.CartValidationPages;
import com.qa.pages.SearchingProductPages;
import com.qa.utility.XLUtility;

public class TC_CartValidation_01 extends TestBase {
	
	
		 
		 
	@Test
	public void handleCart() throws InterruptedException, Throwable {
		
		//confirm whetr item is there 
	Thread.sleep(3000);
		System.out.println("reached");
		FPP.getclickCart().click();
		 
		
		
		int updatedCart = Integer.parseInt(FPP.getCartLocator().getText().replaceAll("[^0-9]", ""));
		Thread.sleep(3000);
		if (updatedCart > 0) {

		int initialCartList =1;
		Assert.assertEquals(updatedCart, initialCartList  + 1);

			System.out.println("There is item in a cart");
			Thread.sleep(2000);
	
		//Thread.sleep(3000);  
		FPP.getclickPlaceOrder().click();
		Thread.sleep(3000);
		System.out.println("reached plce order");
		FPP.getDeliverHere().click();
		Thread.sleep(3000);
		System.out.println("reached plce deliver");
		FPP.getDeliverHereContinue().click();
		Thread.sleep(3000);
		FPP.getGoUpi().click();
		Thread.sleep(3000);
		
		}else
		{
			Assert.assertTrue(false);
			captureScreenShot(driver, "NO ITEM IN  Cart");
		}
		 
	}	 
		
}
