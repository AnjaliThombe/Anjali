package firstesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {
	public static void main(String agr[])
	{
			System.setProperty("webdriver.chrome.driver","D:\\Download\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
			
			
			//driver.switchTo().frame(i);	
			
			WebElement i = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		
			driver.switchTo().frame(i);	
			
			WebElement tryit = driver.findElement(By.xpath("//button[text()='Try it']"));
			tryit.click();
			
			//driver.switchTo().parentFrame();
			//driver.switchTo().defaultContent();  
			
	}
}
