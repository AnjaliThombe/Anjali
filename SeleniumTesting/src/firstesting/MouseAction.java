package firstesting;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction {

	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Download\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/account/login");
		
		WebElement MobileNO= driver.findElement(By.xpath("(//input [@type='text'])[2]"));
		MobileNO.sendKeys("7028389423");
	
		Thread.sleep(3000);

		WebElement Password= driver.findElement(By.xpath("//input [@type='password']"));
		Password.sendKeys("Anjali7768");
		
		Thread.sleep(3000);

		WebElement button=driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		button.click();
		
		Thread.sleep(3000);

		WebElement account =driver.findElement(By.xpath("//span[text()='Cart']"));
		Actions act = new Actions(driver);
		act.moveToElement(account).perform();
	}
}
