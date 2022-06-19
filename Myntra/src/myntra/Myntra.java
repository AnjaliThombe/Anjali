package myntra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {

		/**
		 * @param args
		 * @throws InterruptedException
		 */
		/**
		 * @param args
		 * @throws InterruptedException
		 */
		public static void main(String args[]) throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver","\\D:\\Download\\chromedriver_win32\\chromedriver.exe\\");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.myntra.com//");
			
			Thread.sleep(2000);
			
			WebElement search = driver.findElement(By.xpath("//input[@class='desktop-searchBar']"));
			search.sendKeys("Beige PU Party Block Sandals");
			
			Thread.sleep(2000);
			
			WebElement button = driver.findElement(By.xpath("//a[@class='desktop-submit']"));
			button.click();
			
			Thread.sleep(2000);
			
			WebElement imgselect = driver.findElement(By.xpath("//img[@title='20Dresses Beige PU Party Block Sandals']"));
			imgselect.click();
			
			WebElement selectsize = driver.findElement(By.xpath("//div[@class='size-buttons-size-header']"));
			selectsize.sendKeys("SELECT SIZE");
			
			WebElement selectingsize = driver.findElement(By.xpath("//p[text()='38']"));
			selectingsize.click();
			
			WebElement addtobag = driver.findElement(By.xpath("//div[text()='ADD TO BAG']"));
			addtobag.click();
			
			
			
			
			
//			WebElement addtobag = driver.findElement(By.xpath("(//div[@class='pdp-description-container'])"));
//			addtobag.click();
			
		}
		
}
