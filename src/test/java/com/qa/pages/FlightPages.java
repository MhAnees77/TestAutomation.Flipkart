package com.qa.pages;

import org.openqa.selenium.WebDriver;


	
	import java.util.List;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class FlightPages{
	
	
	WebDriver driver;
			
		
			
			@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/button[1]")
			WebElement cross;
			public WebElement closeThePop_Up()
			{
				return cross;
				
			}
			 
			@FindBy(xpath = "//div[contains(text(),'Travel')]")
			WebElement travel;
			public WebElement goTOTravel()
			{
				return travel;
				
			}
			
			@FindBy(xpath = "//label[@for='ONE_WAY']//div[@class='_1XFPmK']")
			WebElement oneway_Btn;
			public WebElement getOneWay()
			{
				return oneway_Btn;
				
			}
			
			@FindBy(xpath = "//input[@name='0-departcity']")
			WebElement from_Field;
			public WebElement getFrom_Field()
			{
				return from_Field;
				
			}
			 
			@FindBy(xpath = "//div[@class='_3uA4ax']")
			List<WebElement> element_01;
			public List<WebElement> getElement_01()
			{
				return element_01;
				
			}
			
			@FindBy(xpath = "//input[@name='0-arrivalcity']")
			WebElement to_Field;
			public WebElement getTo_Field()
			{
				return to_Field;
				
			}
			
			@FindBy(xpath = "//input[@name='0-datefrom']")
			WebElement depart_Date;
			public WebElement getDepart_Date()
			{
				return depart_Date;
				
			}
			
			@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[5]/td[4]/div[1]/button[1]")
			WebElement choose_Date;
			public WebElement getChoosenDate()
			{
				return choose_Date;
				
			}
			
			@FindBy(xpath = "//label[@for='b']//div[@class='_1XFPmK']")
			WebElement travellers_Class;
			public WebElement getTravellers_Class()
			{
				return travellers_Class;
				
			}
			
			@FindBy(xpath = "//button[normalize-space()='Done']")
			WebElement done_Btn;
			public WebElement getDone_Btn()
			{
				return done_Btn;
				
			}
			
			@FindBy(xpath = "//span[normalize-space()='SEARCH']")
			WebElement search_Btn;
			public WebElement getSearch_Btn()
			{
				return search_Btn;
				
			}
			
			@FindBy(xpath = "//div[contains(text(),'One Way')]")
			WebElement oneWay_radioBtn;
			public WebElement getOneway_RadioBtn()
			{
				return oneWay_radioBtn;
				
			}
			                 //*[@id="container"]/div/div[2]/div[2]/div/div/div[1]/div/div/div[2]/div/div[2]/div[2]/span[2]/span
			@FindBy(xpath = "//*[@id=\"container\"]/div/div[2]/div[2]/div/div/div[1]/div/div/div[2]/div/div[2]/div[2]/span[2]")
			WebElement refundable_Btn;
			public WebElement getRefundable_Btn()
			{
				return refundable_Btn;
				
			}
			
			@FindBy(xpath = "//span[@class='checkbox-button u-pos-rel u-v-align-middle u-ib ']")
			List<WebElement> check_Box;
			public List<WebElement> getDepartFrom_CCU()
			{
				return check_Box;
				
			}
		    
			@FindBy(xpath = "//div[@class='arln-rst']//span[@class='switch-handle']")
			WebElement airlines_Btn;
			public WebElement getAirlines_Btn()
			{
				return airlines_Btn;
				
			}
			
			@FindBy(xpath = "//div[@class='u-ripple']")
			WebElement bookTicket_Btn;
			public WebElement getBookedTicket()
			{
				return bookTicket_Btn;
				
			}
			
			@FindBy(xpath = "//input[@type='text']")
			WebElement mobile_Number;
			public WebElement getMobileNumber()
			{
				return mobile_Number;
				
			}
		    
			@FindBy(xpath = "//button[@type='submit']")
			WebElement continue_Btn_01;
			public WebElement getContinueBTN_001()
			{
				return continue_Btn_01;
				
			}
			
			@FindBy(xpath = "//input[@type='password']")
			WebElement password;
			public WebElement getPassword()
			{
				return password;
				
			}
			
			@FindBy(xpath = "//span[normalize-space()='Login']")
			WebElement login_Btn;
			public WebElement getLogin_Btn()
			{
				return login_Btn;
				
			}
			
			@FindBy(xpath = "//label[@for='1']")
			WebElement available_Coupon;
			public WebElement getAvailable_Coupon()
			{
				return available_Coupon;
				
			}
			
			@FindBy(xpath = "//input[@name='Enter Coupon Code']")
			WebElement applyCouponCode;
			public WebElement getCouponCode()
			{
				return applyCouponCode;
				
			}
			
			@FindBy(xpath = "//div[@class='l39isx']")
			WebElement appln_Btn ;
			public WebElement getApply_Btn()
			{
				return appln_Btn;
				
			}
			
			@FindBy(xpath = "//div[contains(text(),'CONTINUE')]")
			WebElement continue_Btn_02;
			public WebElement getContinueBTN_002()
			{
				return continue_Btn_02;
				
			}
			
			@FindBy(xpath = "//*[@id=\"container\"]/div/div[2]/div/div[1]/div[3]/div[3]/form/div[1]/div/div[2]/div[1]")
			WebElement title;
			public WebElement getTitle()
			{
				return title;
				
			}
			
			
			@FindBy(xpath = "//*[@id=\"container\"]/div/div[2]/div/div[1]/div[3]/div[3]/form/div[1]/div/div[2]/div[2]/div/input")
			WebElement first_Middle_Name;
			public WebElement getFirst_Middle_Name()
			{
				return first_Middle_Name;
				
			}
			
			@FindBy(xpath = "//input[@name='Last Name']")
			WebElement last_Name;
			public WebElement getLast_Name()
			{
				return last_Name;
				
			}
			
			@FindBy(xpath = "//*[@id=\"dropdown-date\"]/div[1]/div/select")
			WebElement DOB_Date;
			public WebElement getDOB_Date()
			{
				return DOB_Date;
				
			}
			
			@FindBy(xpath = "//div[@class='_1AtVbE col-12-12']//div[3]//div[1]//div[2]//div[2]//div[1]//select[1]")
			WebElement DOB_Month;
			public WebElement getDOB_Month()
			{
				return DOB_Month;
				
			}
			
			@FindBy(xpath = "//div[@class='_1AtVbE col-12-12']//div[3]//div[1]//div[2]//div[3]//div[1]//select[1]")
			WebElement DOB_Year;
			public WebElement getDOB_Year()
			{
				return DOB_Year;
				
			}
			
			@FindBy(xpath = "//div[@class='a6-MYl']//select[@class='_1EDlbo _1bIJ-k iUXLpR']")
			WebElement belongingNation;
			public WebElement getBelongingNation()
			{
				return belongingNation;
				
			}
			
			@FindBy(xpath = "//input[@name='Passport Number']")
			WebElement passport_Number;
			public WebElement getPassport_Number()
			{
				return passport_Number;
				
			}
			
			@FindBy(xpath = "//input[@name='Phone Number']")
			WebElement contactPhone_Number;
			public WebElement getContactPhone_Number()
			{
				return contactPhone_Number;
				
			}
			
			@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[3]/form[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/select[1]")
			WebElement PID_Date;
			public WebElement getPID_Date()
			{
				return PID_Date;
				
			}

			@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[3]/form[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[2]/div[1]/select[1]")
			WebElement PID_Month;
			public WebElement getPID_Month()
			{
				return PID_Month;
				
			}
			
			@FindBy(xpath = "//div[4]//div[1]//div[2]//div[3]//div[1]//select[1]")
			WebElement PID_Year;
			public WebElement getPID_Year()
			{
				return PID_Year;
				
			}
			
			@FindBy(xpath = "//div[@class='_3CsjnD _6t1WkM _3HqJxg']//div[2]//div[2]//div[1]//div[1]//select[1]")
			WebElement PED_Date;
			public WebElement getPED_Date()
			{
				return PED_Date;
				
			}
			
			@FindBy(xpath = "//div[@class='_3CsjnD _6t1WkM _3HqJxg']//div[2]//div[2]//div[2]//div[1]//select[1]")
			WebElement PED_Month;
			public WebElement getPED_Month()
			{
				return PED_Month;
				
			}
			
			@FindBy(xpath = "//div[@class='_3CsjnD _6t1WkM _3HqJxg']//div[2]//div[2]//div[3]//div[1]//select[1]")
			WebElement PED_Year;
			public WebElement getPED_Year()
			{
				return PED_Year;
				
			}
			
			@FindBy(xpath = "//div[@class='col-4-12']//div[1]//div[1]//select[1]")
			WebElement issueNation;
			public WebElement getIssueNation()
			{
				return issueNation;
				
			}
			
			@FindBy(xpath = "//input[@name='Email Address']")
			WebElement contact_EmailId;
			public WebElement getContactEmail_Id()
			{
				return contact_EmailId;
				
			}
			
			@FindBy(xpath = "//div[@class='MfYxi1']")
			WebElement continue_BTN_003;
			public WebElement getContinue_Btn_003()
			{
				return continue_BTN_003;
				
			}
			
			@FindBy(xpath = "//div[contains(text(),'origin cannot be empty')]")
			WebElement errorMessage1;
			public WebElement getErrorMessage1()
			{
				return errorMessage1;
				
			}
			
			@FindBy(xpath = "//div[@class='heading']")
			WebElement errorMessage2;
			public WebElement getErrorMessage2()
			{
				return errorMessage2;
				
			}
			
			@FindBy(xpath = "//body/div[@id='container']/div[1]/div[1]")
			WebElement errorMessage3;
			public WebElement getErrorMessage3()
			{
				return errorMessage3;
				
			}
			
			public FlightPages(WebDriver driver)
			{
				PageFactory.initElements(driver,this);
			}
			
		}
	
	
	
	
		

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


