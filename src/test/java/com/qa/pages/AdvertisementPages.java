package com.qa.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AdvertisementPages {

	


WebDriver driver;

 @FindBy(linkText="Advertise")
 WebElement Advertise;
 
 public WebElement getAdvertise() {
	return Advertise;
}

 @FindBy(xpath="//body/app-root[1]/flipscore-ext[1]/div[1]/div[1]/div[1]/div[3]/search[1]/div[1]/input[1]")
	
	WebElement SearchBox;
	
	public WebElement getSearchBox()
	{
		return SearchBox ;
	}

	@FindBy(xpath="//body/app-root[1]/flipscore-ext[1]/div[1]/div[1]/div[1]/div[3]/search[1]/div[1]/div[2]/infinite-scroll[1]/div[1]/div[1]/div[1]/div[1]")
	WebElement searchbutton;
	
	public WebElement getsearchbutton() {
		return searchbutton;
		
	}

	@FindBy(xpath="//div[contains(text(),'Add a brand to compare')]")
	WebElement addbrand;
	
	public WebElement getaddbrand() {
		return addbrand;
	}

	@FindBy(xpath="//body/app-root[1]/trends[1]/div[1]/div[1]/div[2]/div[2]/div[4]/div[1]/search[1]/div[1]/input[1]")
	WebElement Brand2;
	
	public WebElement getBrand2() {
		return Brand2;
	}
	
	@FindBy(xpath="//div[contains(text(),'Samsung')]")
	WebElement search;
	
	public WebElement getsearch() {
		return search;
	}

	
	@FindBy(xpath="/html/body/app-root/flipscore-ext/div/div/div[1]/div[1]/div")
	WebElement BrandText;
	
	public WebElement getBrandText() {
		return BrandText;
	}

		public AdvertisementPages(WebDriver driver) {
  	this.driver =driver;
	  	PageFactory.initElements(driver, this);
   	
    }

}











 
/*@FindBy(xpath = "/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")
WebElement emailid;


public WebElement getemailid() {
	return emailid;
}

@FindBy(xpath = "/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")
WebElement password;


public WebElement getPassword() {
	return password;
}

@FindBy(xpath = "/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button")
WebElement login;



public WebElement getLogin() {
	return login;
}

@FindAll(@FindBy(xpath="//div[contains(text(),'Relevance')]"))
@CacheLookup
List<WebElement> Title_names;

public List<WebElement> getTitle_names(){
	return Title_names;
	
}

@FindBy(xpath = "//body/div[@id='container']/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/input[1]")
WebElement searchtextfeild;

public WebElement getsearchtextfield() {
	return searchtextfeild;
}


@FindBy(tagName="button")
 WebElement clickbtn;
 
public WebElement getclickbtn() {
	return clickbtn;
}


@FindBy(xpath="//body/div[@id='container']/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/a[1]/div[2]/div[1]/div[1]")
WebElement pocomobile;

public WebElement getpocomobile() {
	return  pocomobile;
}

@FindBy(xpath="//input[@id='pincodeInputId']")
WebElement areacode;

public WebElement getareacode() {
	return areacode;
}

@FindBy(className="_2P_LDn")
WebElement check;

 public WebElement getCheck() {
	return check;
}

 @FindBy(xpath="//body/div[@id='container']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/form[1]/button[1]")
 WebElement buynow;
 

 public WebElement getBuynow() {
	return buynow;
}

 @FindBy(xpath="//button[contains(text(),'CONTINUE')]")
 WebElement continuetobuy;

 public WebElement getContinuetobuy() {
	return continuetobuy;
}*/
	
	
	
	
	
