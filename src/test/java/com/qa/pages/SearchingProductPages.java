package com.qa.pages;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchingProductPages {

	WebDriver driver;

	// For
	@FindBy(xpath = "/html/body/div[2]/div/div/button")

	WebElement ClosePopUp;

	public WebElement getClosePopUp() {
		return ClosePopUp;

	}

	@FindBy(xpath = "//body/div[@id='container']/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/input[1]")
	WebElement searchtextfeild;

	public WebElement getsearchtextfield() {
		return searchtextfeild;
	}

	@FindBy(xpath = "//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/button")
	WebElement MagnifierBttn;

	public WebElement getMagnifierBttn() {
		return MagnifierBttn;

	}

	@FindBy(xpath = "//body/div[@id='container']/div[1]/div[2]/div[1]/div[1]/div[7]/a[1]/div[1]/div[1]/img[1]")

	WebElement MouseHower;

	public WebElement getMouseHower() {
		return MouseHower;

	}

	@FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div/div")
	WebElement ClickItem;

	public WebElement getClickItem() {
		return ClickItem;

	}

	@FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[2]/form/button")
	WebElement ClickBuyNow;

	public WebElement getClickBuyNow() {
		return ClickBuyNow;

	}

	// *[@id="container"]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button

	@FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button")
	WebElement ClickAddToCart;

	public WebElement getClickAddToCart() {
		return ClickAddToCart;

	}

	//// *[@id="container"]/div/div[2]/div/div/div[1]/div[1]/div[2]/div/div[2]/div[2]/div[3]/button
	@FindBy(xpath = "//*[@id=\"container\"]/div/div[2]/div/div/div[1]/div[1]/div[2]/div/div[2]/div[2]/div[3]/button")
	WebElement ClickAddToCartCnfrm;

	public WebElement getClickAddToCartCnfrm() {
		return ClickAddToCartCnfrm;

	}

	// search item name
	// //*[@id="container"]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button

	@FindBy(xpath = "//button[contains(text(),'Deliver Here')]")

	WebElement DeliverHere;

	public WebElement getDeliverHere() {
		return DeliverHere;
	}

	@FindBy(xpath = "//button[contains(text(),'CONTINUE')]")

	WebElement DeliverHereContinue;

	public WebElement getDeliverHereContinue() {
		return DeliverHereContinue;
	}

	@FindBy(xpath = "//*[@id=\"container\"]/div/div[2]/div/div[1]/div[4]/div/div/div[2]/div/label[1]/div[1]")

	WebElement GoUpi;

	public WebElement getGoUpi() {
		return GoUpi;
	}

	@FindBy(xpath = "//*[@id=\"container\"]/div/div[2]/div/div[1]/div[3]/div/div/div/div/div[5]/span[1]/form/input")

	WebElement Sendmail;

	public WebElement getSendmail() {
		return Sendmail;

	}

	@FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[1]/div/div/span/span")

	WebElement TextContains;

	public WebElement getTextContains() {
		return TextContains;

	}

	public SearchingProductPages(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
