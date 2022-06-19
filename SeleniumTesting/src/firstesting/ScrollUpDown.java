package firstesting;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpDown {

	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Download\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
	Thread.sleep(2000);
	
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");     //DOWN
		
		Thread.sleep(2000);

		js.executeScript("window.scrollBy(0,-700)");	//UP
		
		Thread.sleep(2000);

		js.executeScript("window.scrollBy(7000,0)");		//RIGHT
		
		Thread.sleep(2000);

		js.executeScript("window.scrollBy(1000,0)");	//LEFT
	}
}
