package com.qa.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SupercoinPages {


	WebDriver driver;

	// For uncliking popup
	@FindBy(xpath = "/html/body/div[2]/div/div/button")

	WebElement ClosePopUp;

	public WebElement getClosePopUp() {
		return ClosePopUp;

	}
 
	// Login
	// a username
	// For uncliking popup
	@FindBy(xpath = "/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")

	WebElement userName;

	public WebElement getuserName() {
		return userName;

	}

	// password
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")

	WebElement passWord;

	public WebElement getpassWord() {
		return passWord;

	}
	// signinn

	@FindBy(xpath = "/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button")

	WebElement signIn;

	public WebElement getsignIn() {
		return signIn;

	}

	/////////////////////////////////////////////// LOGOUT///////////////

	@FindBy(className = "_28p97w")
	WebElement mouseHowerOnLogin;

	public WebElement getmouseHowerOnLogin() {
		return mouseHowerOnLogin;
	}
	///// click profile

	@FindBy(xpath = "//div[contains(text(),'My Profile')]")
	WebElement Myrofile;

	public WebElement getMyrofile() {
		return Myrofile;
	}

	// logout
	@FindBy(xpath = "//span[contains(text(),'Logout')]")
	WebElement logOut;

	public WebElement getlogOut() {
		return logOut;
	}
	/////////////////////////////////////////////////////////////////// SUPER
	/////////////////////////////////////////////////////////////////// Coin/////////////////

	@FindBy(className = "exehdJ")
	WebElement mouseHowerOnName;

	public WebElement getmouseHowerOnName() {
		return mouseHowerOnName;
	}

	@FindBy(xpath = "//div[contains(text(),'SuperCoin Zone')]")
	WebElement superCoin;

	public WebElement getsuperCoin() {
		return superCoin;
	}

	@FindBy(className = "EbcYjC")
	WebElement superCoinCount;

	public WebElement getsuperCoinCount() {
		return superCoinCount;
	} // body/div[@id='container']/div[1]/div[3]/div[1]/div[1]/div[2]/div[4]/div[1]/a[1]/div[1]/div[1]/img[2]
	// *[@id="container"]/div/div[3]/div/div/div[2]/div[4]/div/a/div/div/img[2]

	@FindBy(xpath = "//body/div[@id='container']/div[1]/div[3]/div[1]/div[1]/div[2]/div[4]/div[1]/a[1]/div[1]/div[1]/img[2]")
	WebElement exploreMore;

	public WebElement getexploreMore() {
		return exploreMore;
	}
	
	//// load all item
	@FindBy(xpath = "/html/body/div/div/div[3]")

	List<WebElement> LoadedSearchItem;

	public List<WebElement> getLoadedSearchItem() {
		return LoadedSearchItem;
	}

	/////////////////// selecting item //////////////////// //
	//body/div[@id='container']/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/div[1]/div[1]/img[1]
	@FindBy(xpath ="//body/div[@id='container']/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/div[1]/div[1]/img[1]")

	WebElement SelectANItemt;

	public WebElement getSelectANItemt() {
		return SelectANItemt;
	}
	/// fav
	//*[@id="container"]/div/div[3]/div/div[2]/div[2]/div/div[2]/div/a/div[3]/div
	// body/div[@id='container']/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/a[1]/div[3]/div[1]/*[1]
	@FindBy(xpath ="//*[@id=\"container\"]/div/div[3]/div/div[2]/div[2]/div/div[2]/div/a/div[3]")

	WebElement AddFavrt;

	public WebElement getAddFavrt() {
		return AddFavrt;
	}

	// div[contains(text(),'Wishlist')]

	/// wishlist
	@FindBy(xpath ="//body/div[@id='container']/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[2]/div[2]/div[1]/ul[1]/li[5]/a[1]")

	WebElement GoToWishlist;

	public WebElement getGoToWishlist() {
		return GoToWishlist;
	}
	//body/div[@id='container']/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/a[1]
	@FindBy(xpath ="//*[@id=\"container\"]/div/div[3]/div/div[2]/div/div/div[2]/a")

	WebElement SelectItemInWishListed;

	public WebElement getSelectItemInWishListed() {
		return SelectItemInWishListed;
	}

	///////////////////// Select size
	///////////////////// //body/div[@id='container']/div[1]/div[3]/div[1]/div[2]/div[6]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]
	// body/div[@id='container']/div[1]/div[3]/div[1]/div[2]/div[6]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]
	@FindBy(xpath ="//*[@id=\"swatch-0-size\"]/a")

	WebElement SelectSize;

	public WebElement getSelectSize() {
		return SelectSize;

	}
     ////////////////////////////ReadingPower
	
	@FindBy(xpath ="//*[@id=\"swatch-0-reading_power\"]/a")

	WebElement ReadingPower;

	public WebElement getReadingPower() {
		return ReadingPower;
	}
	
	
	//button[contains(text(),'Deliver Here')]    ///   //button[contains(text(),'CONTINUE')]
	
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
	
	@FindBy(xpath ="//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[2]/form/button")

	WebElement BuyNow;

	public WebElement getBuyNow() {
		return BuyNow;
	}

	////// Select a check box

	/*
	 * @FindBy(xpath=
	 * "//*[@id=\"container\"]/div/div[2]/div/div[1]/div[2]/div/div/div/div[1]/label[2]/div[1]")
	 * WebElement AdressCheckBox;
	 * 
	 * public Select getAdressCheckBox() { Select pass = new Select(AdressCheckBox);
	 * return pass; }
	 */
	@FindBy(xpath = "//*[@id=\\\"container\\\"]/div/div[2]/div/div[1]/div[2]/div/div/div/div[1]/label[2]/div[1]")

	WebElement AdressCheckBox;

	public WebElement getAdressCheckBox() {
		return AdressCheckBox;
	}

	// //deleate item from wishlist
	@FindBy(xpath = "//body/div[@id='container']/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/a[1]/div[2]/div[2]/div[1]/span[1]/img[1]")

	WebElement DeleateItemCart;

	public WebElement getDeleateItemCart() {
		return DeleateItemCart;
	}

	@FindBy(xpath = "//button[contains(text(),'YES, REMOVE')]")

	WebElement CnfrmDeleateItemCart;

	
 
	public WebElement geCnfrmDeleateItemCart() {
		return CnfrmDeleateItemCart;
	}

	
	
	@FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div/div[2]/div/div/div[1]/span")

	WebElement WhishListLocator;

	public Object getWhishListLocator;
	public WebElement getWhishListLocator() {
		return WhishListLocator;
	}

	@FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div/div[2]/div/div/div/span[1]")

	WebElement NoItemInWhishlist;

	//public Object ;//*[@id="container"]/div/div[3]/div/div[2]/div/div/div/span[1]
	public WebElement getNoItemInWhishlist() {
		return NoItemInWhishlist;
	}
	@FindBy(xpath = "//*[@id=\\\"container\\\"]/div/div[3]/div/div[2]/div[1]/div/div/h1")

	WebElement itemNamee;

	//public Object ;//*[@id="container"]/div/div[3]/div/div[2]/div/div/div/span[1]
	public WebElement getitemNamee() {
		return itemNamee;
	}
	 
	public SupercoinPages(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
