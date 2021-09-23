package com.qa.testScripts;



import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Driver;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import javax.swing.text.Document;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.google.common.collect.Table.Cell;

import io.github.bonigarcia.wdm.WebDriverManager;

	public class TC_Flight_01 extends TestBase
	{
	 
		//WebDriver driver;
		//WebElement element;
		Select select; 
		//flightbookingPage page; 
		TakesScreenshot ts1;
		File screenshotAs;
		//Properties prop;
		//String path="C:\\WORKSPACE\\TestAutomation.Flipkart\\src\\test\\java\\com\\qa\\testdata\\testData.properties";
	
		JavascriptExecutor jse;
		//TakesScreenshot ts=(TakesScreenshot)driver;
	//	SoftAssert softAssertion;
		String actual_result;
		String expected_result;
		 
		
		 
		@Test(priority=1)
		public void selectTheFlight() throws InterruptedException, IOException
		{
		
				
					
				    page.goTOTravel().click();
				    Thread.sleep(3000);
				    page.getOneWay().click();
				    Thread.sleep(3000);
				    
				    WebElement deptPlace=page.getFrom_Field();
				    Actions action=new Actions(driver);
				    action.moveToElement(deptPlace).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
				    Thread.sleep(5000);
				    
				     
				    //prop.load(fileLoc);
				    String str1=prop.get("departCity").toString();
				    Assert.assertEquals(deptPlace.isDisplayed(), true);
					Reporter.log("Search Box is displayed." + "<br>", true);
					
				    deptPlace.sendKeys(str1);
				    Thread.sleep(3000);
				    
				   // @SuppressWarnings("unchecked")
					List<WebElement> ele=page.getElement_01();
					  for (int i = 0; i < ele.size(); i++)
					  {
						String text=ele.get(i).getText();
						System.out.print(text);
						if(text.contains("Kolkata"))
						{
							ele.get(i).click();
							Assert.assertTrue(true);
							System.out.println("clicked");
							break;
						}
						else {
							System.out.println("did't click");
						}
					}
					 Thread.sleep(3000);
					 
					 WebElement arrivalPlace=page.getTo_Field();
					  
					    String str2=prop.getProperty("arrivalCity");
					    arrivalPlace.sendKeys(str2);
					  @SuppressWarnings("unchecked")
					List<WebElement> ele2=page.getElement_01();
					  for (int i = 0; i < ele2.size(); i++)
					  {
						String text2=ele2.get(i).getText();
						System.out.print(text2);
						if(text2.contains("Bangkok"))
						{
							ele2.get(i).click();
							Assert.assertTrue(true);
							System.out.println("clicked");
							break;
						}
						else
						{
							System.out.println("did't click");
						}
					}
					  Thread.sleep(3000);
				   page.getDepart_Date().click();
				   Thread.sleep(3000);
				   page.getChoosenDate().click();
				   Thread.sleep(3000);
				   page.getTravellers_Class().click();
				   Thread.sleep(3000);
				   page.getDone_Btn().click();
				   Thread.sleep(3000); 
				   page.getSearch_Btn().click();
				  
				  WebElement radio_btn=page.getOneway_RadioBtn();
				  radio_btn.click();
				  
				  Thread.sleep(3000);
				 // page.getRefundable_Btn().click();
				  Thread.sleep(8000);
				  System.out.println("rch1");
				  /*List<WebElement> ccu=page.getDepartFrom_CCU();
				  for(WebElement elem :ccu)
				  {
					 elem.click(); 
					 Assert.assertTrue(true);
					 System.out.println("Checkbox Seleceted");
				  }
				  Thread.sleep(3000);*/
				  
				  page.getAirlines_Btn().click();
				  Thread.sleep(3000);
				  page.getBookedTicket().click();
				  System.out.println("rch2");  
				/*  WebElement phn_Num=page.getMobileNumber();
				  phn_Num.click();
				  
				 
				  String str3=prop.getProperty("phoneNum");
				  
				  actual_result=str3;
				  expected_result= "7683855088";
				  if(actual_result.equalsIgnoreCase(expected_result))
				  { 
				  System.out.println("Test passed for Moblie Number"); 
				  phn_Num.sendKeys(str3);
				  Assert.assertEquals(true, phn_Num.isEnabled()); //Verifies that element is disabled
				  System.out.println("Element is Disbaled – Assert passed");
					 
				  page.getContinueBTN_001().click();
				  Thread.sleep(3000);
				  }
				  else 
				  {
					  System.out.println("Test failed for Moblie Number"); 
					  Assert.assertTrue(false);
						Reporter.log("===Can't do further actions Sorry ===");
						
				 } 
				  
				  Thread.sleep(3000); 
				  
				  WebElement pwd=page.getPassword();
				  pwd.click();
				  
				 
				  String str4=prop.getProperty("password");
				  
				  actual_result=str4;
				  expected_result= "Flipkartpassword@22";
				  if(actual_result.equalsIgnoreCase(expected_result))
				  { 
				  System.out.println("Test passed for Password"); 
				  Assert.assertTrue(true);
				  pwd.sendKeys(str4); 
				  page.getLogin_Btn().click(); 
				  }
				  else 
				  {
					  System.out.println("Test failed for Password");
						Reporter.log("===Can't do further actions Sorry ===");
						Assert.assertTrue(false);
				 }*/ 
				  
				  Thread.sleep(3000); 
				  
				  jse=(JavascriptExecutor)driver;
					 jse.executeScript("window.scrollBy(0,700)");
					 Thread.sleep(2000);
					/* 
				  page.getAvailable_Coupon().click(); 
				  Thread.sleep(3000);
				  WebElement cpn_Code=page.getCouponCode();
				  cpn_Code.click();
				  System.out.println("rch3");
				  
				  String str5=prop.getProperty("couponCode");
				  
				  actual_result=str5;
				  expected_result= "FLYNEW";
				  if(actual_result.equals(expected_result))
				  {
					  System.out.println("Test passed for coupon code"); 
					  Assert.assertTrue(true);
					  cpn_Code.sendKeys(str5); 
				  }
				  else
				  {
					  System.out.println("Test failed for coupon code"); 
						Reporter.log("===Can't do further actions Sorry ===");
						Assert.assertTrue(false);  
				  }
				  
				  Thread.sleep(3000);
				  page.getApply_Btn().click();
				  */
				  System.out.println("rch4");
				  
				  page.getContinueBTN_002().click();
				  System.out.println("rch5");
				  Thread.sleep(3000);
				  WebElement title=page.getTitle();
				  select=new Select(title);
				  select.selectByIndex(2);
				  Thread.sleep(3000);
				  System.out.println("rch6");
				  WebElement f_name=page.getFirst_Middle_Name(); 
				  f_name.click();
				  
				  
				  String str6=prop.getProperty("Name");
				  f_name.sendKeys(str6);
				  Thread.sleep(3000);
				  
				  WebElement l_Name=page.getLast_Name(); 
				  l_Name.click();
				  
				 
				  String str7=prop.getProperty("sureName"); 
				  l_Name.sendKeys(str7);
				  Thread.sleep(3000);
				  
				  WebElement date1=page.getDOB_Date(); select=new Select(date1);
				  select.selectByIndex(22); 
				  Thread.sleep(3000);
				  
				  WebElement month1=page.getDOB_Month(); 
				  select=new Select(month1);
				  select.selectByIndex(4); 
				  Thread.sleep(3000);
				  
				  WebElement year1=page.getDOB_Year(); 
				  select=new Select(year1);
				  select.selectByVisibleText("2000");
				  Thread.sleep(3000);
				  
				  WebElement nation=page.getBelongingNation(); 
				  nation.click(); 
				  select=new Select(nation); 
				  select.selectByVisibleText("India");
				  Thread.sleep(3000);
				  
				  WebElement date2=page.getPID_Date(); date2.click();
				  select=new Select(date2);
				  select.selectByIndex(12);
				  Thread.sleep(3000);
				  
				  WebElement month2=page.getPID_Month();
				  month2.click(); 
				  select=new Select(month2); 
				  select.selectByVisibleText("Sep"); 
				  Thread.sleep(3000);
				  
				  WebElement year2=page.getPID_Year();
				  year2.click(); 
				  select=new Select(year2);
				  select.selectByVisibleText("2019"); 
				  Thread.sleep(3000);
				  
				  WebElement date3=page.getPED_Date();
				  date3.click();
				  select=new Select(date3);
				  select.selectByIndex(18);
				  Thread.sleep(3000);
				  
				  WebElement month3=page.getPED_Month();
				  month3.click(); 
				  select=new Select(month3); 
				  select.selectByIndex(10); 
				  Thread.sleep(3000);
				  
				  WebElement year3=page.getPED_Year();
				  year3.click(); 
				  select=new Select(year3);
				  select.selectByVisibleText("2022");
				  Thread.sleep(3000);
				  
				  WebElement passNum= page.getPassport_Number();
				  passNum.click(); 
				  
				 
				  String str8=prop.getProperty("passportNumber");
				  passNum.sendKeys(str8);
				  Thread.sleep(3000);
				  
					/*
					 * WebElement issueNation=page.getIssueNation(); issueNation.click(); select=new
					 * Select(issueNation); select.selectByVisibleText("Thailand");
					 * Thread.sleep(3000);
					 */
				  
			      jse=(JavascriptExecutor)driver;
				  jse.executeScript("window.scrollBy(0,400)"); 
				  Thread.sleep(2000);
				  
				  WebElement phnNum=page.getContactPhone_Number();
				  phnNum.click();
				  
				
				  String str9=prop.getProperty("phoneNum"); 
				  phnNum.sendKeys(str9);
				  Thread.sleep(3000);
				  
				  WebElement email=page.getContactEmail_Id();
				  email.click();
				  
				  
				  String str10=prop.getProperty("emailId");
				  email.sendKeys(str10);
				  Thread.sleep(3000);
				  
				  page.getContinue_Btn_003().click(); 
				  Thread.sleep(15000);
				  
				  }
		  
		  }
