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
 
 
	public class TC_HomePageValidation_01 extends TestBase{
		 
		 
		private int initialWhishList=0;

		@Test
		public  void handleElectronics() throws InterruptedException, IOException {
			 
	
			
		 	
			String  currentUrl=driver.getCurrentUrl();
			
			
			String expUrl="https://www.flipkart.com/";
			if(currentUrl.equals(expUrl))
			{
				System.out.println("User is in Home page");
				Reporter.log("User is in Home page");
				Assert.assertEquals(expUrl, currentUrl);
			Thread.sleep(4000);
			}
			else
			{
				Assert.assertTrue(false);
				captureScreenShot(driver,"Validation fails");
			}
			
		}
	}
	
			
			
			
			
			
			
			//Fp =new ElectronicPages(driver);
		
		
		/*Thread.sleep(3000);
	        WebElement ele=Fp.getelement() ;
	        
			act.moveToElement(ele).build().perform();
		   Fp.getGaElement().click();
			Thread.sleep(3000);
			
			Fp.getComp().click();
			Thread.sleep(3000);
			
			Set<String> handle=driver.getWindowHandles();
			 for(String s :handle)
			 { 
				 driver.switchTo().window(s);
			 }
			 WebElement eleo =Fp.getEleone();
			 act.moveToElement(eleo).build().perform();
				Thread.sleep(2000);

			 WebElement elet =Fp.getEletwo();
			 act.moveToElement(elet).build().perform();
				Thread.sleep(2000);

	         Fp.getAddToCart().click();
	            
	         Thread.sleep(5000);
	         int updatedlWhishList = Integer.parseInt(Fp.getWhishListLocator().getText().replaceAll("[^0-9]", ""));
				Thread.sleep(4000);
		 

					Assert.assertEquals(updatedlWhishList, initialWhishList + 2);
				 
					 Reporter.log("The Searched Item is in cart : "+updatedlWhishList, true);
					 Fp.getplaceOrder().click();

			
		} */
		//}