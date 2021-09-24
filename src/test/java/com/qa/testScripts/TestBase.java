package com.qa.testScripts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.qa.pages.AdvertisementPages;
import com.qa.pages.SearchingProductPages;
import com.qa.pages.CartValidationPages;
import com.qa.pages.HomePageValidationPages;
import com.qa.pages.FlightPages;
import com.qa.pages.SupercoinPages;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	WebDriver driver;
	Actions act;
	JavascriptExecutor Js;
	TakesScreenshot ts;
	String parent;
	WebElement login;
	String superCoinCountt;
	SoftAssert sa = new SoftAssert();
	Properties prop;
	FileInputStream fileLoc;

	SupercoinPages FP_OR;
	AdvertisementPages Flipsearch;
	HomePageValidationPages Fp;
	SearchingProductPages FPS;
	CartValidationPages FPP;
	FlightPages page;

	@BeforeClass
	@Parameters({ "Browser", "url" })
	public void setUp(String browser, String url) throws Throwable {
		// 1 open in cross Broswer
		if (browser.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			Reporter.log("chrome");
		} else if (browser.equalsIgnoreCase("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			Reporter.log("Edge");
		} else if (browser.equalsIgnoreCase("FireFox")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			Reporter.log("FireFox");
		} else if (browser.equalsIgnoreCase("IE")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			Reporter.log("IE");

		}
		driver.get(url);

		driver.manage().window().maximize();

		act = new Actions(driver);
		FP_OR = new SupercoinPages(driver);
		Fp = new HomePageValidationPages(driver);
		Flipsearch = new AdvertisementPages(driver);
		FPS = new SearchingProductPages(driver);
		FPP = new CartValidationPages(driver);
		page = new FlightPages(driver);
		Js = (JavascriptExecutor) driver;
		fileLoc = new FileInputStream(
				"C:\\WORKSPACE\\TestAutomation.Flipkart\\src\\test\\java\\com\\qa\\testdata\\testData.properties");
		prop = new Properties();
		prop.load(fileLoc);
		handleLogin();
		// driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);

	}

	@AfterClass
	public void tearDown() throws InterruptedException, IOException {
		handleLogOut();
		driver.quit();
	}

	public void handleLogin() throws InterruptedException, Throwable {

		FP_OR.getuserName().sendKeys(prop.getProperty("username"));
		Thread.sleep(2000);
		FP_OR.getpassWord().sendKeys(prop.getProperty("passwordd"));
		Thread.sleep(2000);
		FP_OR.getsignIn().click();
		captureScreenShot(driver, "LogIn");
		Reporter.log("========LOGIN SUCCESFULL==========");
		Thread.sleep(3000);
	}

	public void captureScreenShot(WebDriver Driver, String tname) throws IOException {
		ts = (TakesScreenshot) Driver;
		File Source = ts.getScreenshotAs(OutputType.FILE);
		File Target = new File(System.getProperty("user.dir") + "/ScreenShots/" + tname + ".png");
		FileUtils.copyFile(Source, Target);
		System.out.println("Screenshot captured");
	}

	public void handleLogOut() throws InterruptedException, IOException {

		WebElement login = FP_OR.getmouseHowerOnLogin();
		act.moveToElement(login).build().perform();

		FP_OR.getMyrofile().click();
		Thread.sleep(3000);

		Js.executeScript("window.scrollBy(0,350)");
		Thread.sleep(2000);

		FP_OR.getlogOut().click();

		Thread.sleep(2000);
	}
}
