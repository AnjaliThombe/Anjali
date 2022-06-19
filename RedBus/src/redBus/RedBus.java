package redBus;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Download\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.redbus.in/");
		
		
		WebElement FROM = driver.findElement(By.xpath("//input[@id='src']"));
		FROM.sendKeys("Pune");
		
		Thread.sleep(3000);
    	
		WebElement TO = driver.findElement(By.xpath("//input[@id='dest']"));
		TO.sendKeys("Solapur");
		
		Thread.sleep(3000);
    	
    	WebElement button = driver.findElement(By.xpath("//span[contains(@class,'fl icon-calendar')]"));
    	button.click();
    	
         Thread.sleep(3000);
    	
    	WebElement Date = driver.findElement(By.xpath("//label[@for='tomorrow']"));
    	Date.click();
    	
		Thread.sleep(3000);
		
    	WebElement Search = driver.findElement(By.xpath("//button[@id='search_btn']"));
    	Search.click();

    	Thread.sleep(5000);
    	
    	WebElement close1  = driver.findElement(By.xpath("//i[@class='icon icon-close c-fs']"));
    	close1.click();
   	
    	Thread.sleep(5000);
    	  
         WebElement close2  = driver.findElement(By.xpath("//i[@class='icon icon-close']"));
         close2.click();
       	
         Thread.sleep(3000);
  	  
 	    WebElement View = driver.findElement(By.xpath("(//div[@class='button view-seats fr'])[1]"));
  	    View.click();
  	
    	//JavascriptExecutor js = (JavascriptExecutor)driver;
    	//js.executeScript("arguments[0].scrollInToView(true);",	View2);
    	
        Thread.sleep(3000);
        
    	 //WebElement seat = driver.findElement(By.xpath("//canvas[@class='pointer']"));
    	 //seat.click();

	}

}
