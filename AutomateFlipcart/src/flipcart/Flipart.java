package flipcart;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipart {
public static void main(String args[]) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","D:\\Download\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/account/login");
	
//	String url=driver.getCurrentUrl(); //Current url
//	System.out.println(url);
//	Thread.sleep(3000);
//	String title=driver.getTitle(); //Current Title of url
//	System.out.println(title);
//	Thread.sleep(3000);
//	Dimension d = new Dimension(400,600);  //changing browser size
//	driver.manage().window().setSize(d);
//	
//	Thread.sleep(3000);
//	Point p = new Point(300,900);
//	driver.manage().window().setPosition(p);
	
	WebElement MobileNO= driver.findElement(By.xpath("(//input [@type='text'])[2]"));
	MobileNO.sendKeys("7028389423");
	
	Thread.sleep(3000);

	WebElement Password= driver.findElement(By.xpath("//input [@type='password']"));
	Password.sendKeys("Anjali7768");
	
	Thread.sleep(3000);

	WebElement button=driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
	button.click();
	
	Thread.sleep(3000);
	
	WebElement SearchText= driver.findElement(By.xpath("//input[@type='text']"));
	SearchText.sendKeys("DIZO Watch 2 (by realme TechLife)");
	
	Thread.sleep(3000);
	
	WebElement buttonn=driver.findElement(By.xpath("//button[@type='submit']"));
	buttonn.click();
	
	Thread.sleep(3000);
	
	WebElement img=driver.findElement(By.xpath("(//img[@class='_396cs4 _3exPp9'])[5]"));
	img.click();
	
	Thread.sleep(3000);
	
	ArrayList<String> addr = new ArrayList<String>(driver.getWindowHandles()) ;/// new tab handle by this method
    
	driver.switchTo().window(addr.get(1));                                        // to sift the selenium foced to new tab
	
	System.out.println(driver.getCurrentUrl());
	
	Thread.sleep(3000);

	WebElement AddtoCart=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']"));
	AddtoCart.click();
	
	Thread.sleep(3000);
	
	WebElement PlaceOrder=driver.findElement(By.xpath("//span[text()='Place Order']"));
	PlaceOrder.click();
	
	WebElement account =driver.findElement(By.xpath("//span[text()='Cart']"));
	Actions act = new Actions(driver);
	act.moveToElement(account).perform();
	
	
}
		}
