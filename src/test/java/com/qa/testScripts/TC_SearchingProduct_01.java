 package com.qa.testScripts;

import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.pages.CartValidationPages;
import com.qa.pages.SearchingProductPages;
import com.qa.pages.SupercoinPages;
import com.qa.utility.XLUtility;


public class TC_SearchingProduct_01 extends TestBase {

	@Test(dataProvider = "searchData")
	public void handleSearchItems(String[] data1) throws Throwable {
	
		Thread.sleep(3000);  
		String parent = driver.getWindowHandle();

		WebElement clearTesxtfield = FPS.getsearchtextfield();
		act = new Actions(driver);
		act.moveToElement(clearTesxtfield).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
		Thread.sleep(3000);
		FPS.getsearchtextfield().sendKeys(data1[0]);
		FPS.getMagnifierBttn().click();
		Thread.sleep(4000);
		String title = FPS.getTextContains().getText();
 
		if (title.contains(data1[0])) {
			Reporter.log("The Searched Item is: Presesnt ", true);
		} else {
			Reporter.log("The Searched Item is: Not Present", true);
			captureScreenShot(driver, "NO Item is found");
			Assert.assertTrue(false, "NO Item is found");
		}
		
		
		
		act.moveToElement(clearTesxtfield).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
		Thread.sleep(3000);

		FPS.getsearchtextfield().sendKeys(data1[1]);
		FPS.getMagnifierBttn().click();
		Thread.sleep(4000);
		String title2 = FPS.getTextContains().getText();

		if (title2.contains(data1[1])) {
			Reporter.log("The Searched Item is: Presesnt ", true);
		} else {
			Reporter.log("The Searched Item is: Not Present", true);
			captureScreenShot(driver, "NO Item is found");
			Assert.assertTrue(false, "NO Item is found");
		}

		act.moveToElement(clearTesxtfield).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
		Thread.sleep(3000);
		FPS.getsearchtextfield().sendKeys(data1[2]);
		FPS.getMagnifierBttn().click();
		Thread.sleep(4000);
		String title3 = FPS.getTextContains().getText();

		if (title3.contains(data1[2])) {
			Reporter.log("The Searched Item is: Presesnt ", true);
		} else {
			Reporter.log("The Searched Item is: Not Present", true);
			captureScreenShot(driver, "NO Item is found");
			Assert.assertTrue(false, "NO Item is found");
		}
		
		

		act.moveToElement(clearTesxtfield).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
		Thread.sleep(3000); 
		FPS.getsearchtextfield().sendKeys(data1[3]);
		FPS.getMagnifierBttn().click();
		Thread.sleep(4000);
		String title4 = FPS.getTextContains().getText();

		if (title4.contains(data1[3])) {
			Reporter.log("The Searched Item is: Presesnt ", true);
		} else {
			Reporter.log("The Searched Item is: Not Present", true);
			captureScreenShot(driver, "NO Item is found");
			Assert.assertTrue(false, "NO Item is found");
		}

		
		Thread.sleep(3000);
		FPS.getClickItem().click();
		/// to handle windows
		Set<String> handle = driver.getWindowHandles();// gets window name

		for (String se : handle) {
			driver.switchTo().window(se); 
		}
		FPS.getClickAddToCart().click();
		//FP_OR.getBuyNow().click();
		Thread.sleep(5000);
		FPS.getClickAddToCartCnfrm().click(); 
		Thread.sleep(4000);
		driver.switchTo().window(parent);
		
		// To bus now
		// FP.getGoUpi().click();
		// FP.getSendmail().sendKeys(data1[2]);
		// Thread.sleep(1000);
		// .getSendmailToContinue().click();
		// FP.getDeliverHere().click();
		// Thread.sleep(1000);

		// FP.getDeliverHereContinue().click();
		// FP.getGoUpi().click();
		//driver.switchTo().window(parent);
	}

	@DataProvider(name = "searchData")
	public String[][] getData() throws Throwable {

		String path = "C:\\WORKSPACE\\TestAutomation.Flipkart\\src\\test\\java\\com\\qa\\testdata\\Flipcart Script1.xlsx";
		XLUtility utility = new XLUtility(path);

		int rows = utility.getRowCount("Sheet4");
		int cols = utility.getCellCount("Sheet4", 1);
		String[][] data = new String[rows][cols];

		for (int i = 1; i <= rows; i++) {
			for (int j = 0; j < cols; j++) {
				data[i - 1][j] = utility.getCellData("Sheet4", i, j);
			}
		}
		return data;
	}

}