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

	@FindBy(linkText = "Advertise")
	WebElement Advertise;

	public WebElement getAdvertise() {
		return Advertise;
	}

	@FindBy(xpath = "//body/app-root[1]/flipscore-ext[1]/div[1]/div[1]/div[1]/div[3]/search[1]/div[1]/input[1]")

	WebElement SearchBox;

	public WebElement getSearchBox() {
		return SearchBox;
	}

	@FindBy(xpath = "//body/app-root[1]/flipscore-ext[1]/div[1]/div[1]/div[1]/div[3]/search[1]/div[1]/div[2]/infinite-scroll[1]/div[1]/div[1]/div[1]/div[1]")
	WebElement searchbutton;

	public WebElement getsearchbutton() {
		return searchbutton;

	}

	@FindBy(xpath = "//div[contains(text(),'Add a brand to compare')]")
	WebElement addbrand;

	public WebElement getaddbrand() {
		return addbrand;
	}

	@FindBy(xpath = "//body/app-root[1]/trends[1]/div[1]/div[1]/div[2]/div[2]/div[4]/div[1]/search[1]/div[1]/input[1]")
	WebElement Brand2;

	public WebElement getBrand2() {
		return Brand2;
	}

	@FindBy(xpath = "//div[contains(text(),'Samsung')]")
	WebElement search;

	public WebElement getsearch() {
		return search;
	}

	@FindBy(xpath = "/html/body/app-root/flipscore-ext/div/div/div[1]/div[1]/div")
	WebElement BrandText;

	public WebElement getBrandText() {
		return BrandText;
	}

	public AdvertisementPages(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

}

