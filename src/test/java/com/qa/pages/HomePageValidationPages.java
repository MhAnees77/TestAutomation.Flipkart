package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageValidationPages {
	WebDriver driver;

	@FindBy(xpath = "//div[contains(text(),'Muhammed hasan')]")

	WebElement usernameLogo;

	public WebElement getusernameLogo() {
		return usernameLogo;

	}

	@FindBy(xpath = "//*[@id=\"container\"]/div/div[2]/div/div/div[5]/a/div[2]/div[1]/div")
	WebElement element;

	public WebElement getelement() {
		return element;
	}

	@FindBy(xpath = "//body/div[@id='container']/div[1]/div[2]/div[1]/div[1]/div[5]/a[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/a[4]")
	WebElement GaElement;

	public WebElement getGaElement() {
		return GaElement;

	}

	@FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div[2]/div/a[1]/div[1]/div")
	WebElement Comp;

	public WebElement getComp() {
		return Comp;

	}

	@FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[1]/div/div[1]/div[1]/div/div[1]/ul/li[2]/div/div")
	WebElement Eleone;

	public WebElement getEleone() {
		return Eleone;

	}

	@FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[1]/div/div[1]/div[1]/div/div[1]/ul/li[3]/div/div")
	WebElement Eletwo;

	public WebElement getEletwo() {
		return Eletwo;

	}

	@FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button")
	WebElement AddToCart;

	public WebElement getAddToCart() {
		return AddToCart;

	}

	// *[@id="container"]/div/div[2]/div/div/div[1]/div/div[3]/div/form/button
	@FindBy(xpath = "//*[@id=\"container\"]/div/div[2]/div/div/div[1]/div/div[3]/div/form/button/span")
	WebElement placeOrder;

	public WebElement getplaceOrder() {
		return placeOrder;

	}

	@FindBy(xpath = "//*[@id=\"container\"]/div/div[2]/div/div/div[1]/div/div[1]/div[1]/div/div[1]")

	WebElement WhishListLocator;

	public Object getWhishListLocator;

	public WebElement getWhishListLocator() {
		return WhishListLocator;
	}

	public HomePageValidationPages(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
