package com.qa.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartValidationPages {
	
	
	
	//*[@id="container"]/div/div[1]/div[1]/div[2]/div[5]/div/div/a/svg/path
	
	WebDriver driver; 
	
	
	 @FindBy(xpath = "//*[@id=\"container\"]/div/div[2]/div/div/div[1]/div[1]/div[1]/div[1]/div/div[1]")
	   
	   	WebElement CartLocator;
	   	
	        public WebElement getCartLocator()
	   	{
	   		return CartLocator ;
	   		
	   	
	   	
	   	}
	
	
	
	
	 @FindBy(xpath = "//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[5]/div/div/a/span")
	   
	   	WebElement clickCart;
	   	
	        public WebElement getclickCart()
	   	{
	   		return clickCart ;
	   		
	   	
	   	
	   	}
	
	
	
	 /*@FindBy(xpath = "//*[@id=\"container\"]/div/div[2]/div/div/div[1]/div[1]/div[1]/div[1]/div/div[1]")
	   
	   	WebElement clickCartItem;
	   	
	        public WebElement getclickCartItem()
	   	{
	   		return clickCartItem ;
	   		
	   	
	   	
	   	}*/
	        
	        //place order  //*[@id="container"]/div/div[2]/div/div/div[1]/div[1]/div[3]/div/form/button/span
	   
	        @FindBy(xpath = "//*[@id=\"container\"]/div/div[2]/div/div/div[1]/div[1]/div[3]/div/form/button/span")
	 	   
		   	WebElement clickPlaceOrder;
		   	
		        public WebElement getclickPlaceOrder()
		   	{
		   		return clickPlaceOrder ;
		   		
		   	
		   	
		   	}
		      
	        
	        
	
	
	 @FindBy(xpath="//body/div[@id='container']/div[1]/div[2]/div[1]/div[1]/div[7]/a[1]/div[1]/div[1]/img[1]")
	 	
	 	WebElement MouseHower;
	 	
	      public WebElement getMouseHower()
	 	{
	 		return MouseHower ;
	 		
	 	
	 	
	 	}
	
	



@FindBy(xpath ="//button[contains(text(),'Deliver Here')]")

WebElement DeliverHere;

public WebElement getDeliverHere() {
	return DeliverHere;
}


@FindBy(xpath ="//button[contains(text(),'CONTINUE')]")

WebElement DeliverHereContinue;

public WebElement getDeliverHereContinue() {
	return DeliverHereContinue;
}
	

//*[@id="container"]/div/div[2]/div/div[1]/div[4]/div/div/div[2]/div/label[1]/div[1]

@FindBy(xpath ="//*[@id=\"container\"]/div/div[2]/div/div[1]/div[4]/div/div/div[2]/div/label[1]/div[1]")

WebElement GoUpi;

public WebElement getGoUpi() {
	return GoUpi;
}
	


@FindBy(xpath = "//*[@id=\"container\"]/div/div[2]/div/div[1]/div[3]/div/div/div/div/div[5]/span[1]/form/input")

	WebElement Sendmail;
	
    public WebElement getSendmail()
	{
		return Sendmail ;
		
	
	
	}
    
    //Sendmail continue //*[@id="to-payment"]/button
    
    @FindBy(xpath = "//*[@id=\"to-payment\"]/button")

	WebElement SendmailToContinue;
	
    public WebElement getSendmailToContinue()
	{
		return SendmailToContinue ;
		
	
	
	}
    
  //*[@id="container"]/div/div[3]/div[1]/div[2]/div[1]/div/div/h1
    @FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[1]/div/div/h1")

	WebElement TextContains;
   	
       public WebElement getTextContains()
   	{
   		return TextContains ;
   		
   	
   	
   	}
       
public CartValidationPages(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);

}
}
