package firstesting;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class POPUP {
public static void main(String args[]) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","D:\\Download\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.guru99.com/test/delete_customer.php");
	
	WebElement submit = driver.findElement(By.xpath("//input[@type='submit']"));
	submit.click();
	
	Thread.sleep(4000);
	
	Alert act = driver.switchTo().alert();
	act.accept();
	
	Thread.sleep(4000);
	
	driver.switchTo().alert().accept();
}
}
