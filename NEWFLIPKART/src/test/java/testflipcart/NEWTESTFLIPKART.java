package testflipcart;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import base.Browser;
import pomflipkart.HOMEPAGEOFFLIPKART;
import pomflipkart.LOGINPAGEFLIPKART;
import pomflipkart.LogOutFlipkart;

public class NEWTESTFLIPKART extends Browser {
		private WebDriver driver;
		/**
		 * @param browser
		 */
		private testId;
	
		
		@BeforeTest
		@Parameters ("browser")//browser code
		public void LaunchBrowser(String browser)
		{
		
			reporter = new ExtendHtmlReporter("test-output"+File.separator)
					
			System.out.println(browser);
			
			if(browser.equalsIgnoreCase("chrome")) {
				driver =LunchChromeBrowser();
			}
			if(browser.equalsIgnoreCase("firefox")) {
				driver =LunchfirefoxBrowser();
			}
			if(browser.equalsIgnoreCase("opera")) {
				driver =LunchOperaBrowser();
			}
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		
		
		private WebDriver LunchOperaBrowser() {
			// TODO Auto-generated method stub
			return null;
		}


		private WebDriver LunchfirefoxBrowser() {
			// TODO Auto-generated method stub
			return null;
		}


		private WebDriver LunchChromeBrowser() {
			// TODO Auto-generated method stub
			return null;
		}


		@BeforeMethod	//login code
		public void loginPage()
		{
			LOGINPAGEFLIPKART loginpageflipkart = new LOGINPAGEFLIPKART(driver);
			loginpageflipkart.sendMobileNo("7028389423");
			loginpageflipkart.sendPassword("Anjali7768");
			loginpageflipkart.clickOnloginsButton();
		}
		
//	@Test
//	public void verifyPageTitleTest()
//	{
//		String title=driver.getTitle();
//		System.out.println("the page title is: "+title);
//		Assert.assertEquals(title,"Online Shopping India | Buy Mobiles, Electronics, Appliances, Clothing and More Online at Flipkart.com");
//		
//	}

	@Test
	public void searchProduct()
	{
		HOMEPAGEOFFLIPKART homepageflipcart = new HOMEPAGEOFFLIPKART(driver);
		homepageflipcart.sendText("DIZO Watch 2 (by realme TechLife)");
		homepageflipcart.searchButton();
	}

	
	@AfterMethod	//logout code
	public void logOutFlipcart() throws InterruptedException
	{
		Thread.sleep(2000);
		LogOutFlipkart logoutflipcart = new LogOutFlipkart(driver);
		logoutflipcart.moveToMyAcoount();
		logoutflipcart.clickonLogOut();

	}
		
	@AfterClass // deallocation of object
	public void closeBrowser()
	{
		driver.quit();
	}
	
}


