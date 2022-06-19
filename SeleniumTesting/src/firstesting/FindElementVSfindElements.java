package firstesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementVSfindElements {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Download\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
	
			//findElement return the single WebElement
			//1
			//WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
			//search.sendKeys("poco f1 mobile");
			
			//2
			WebElement footer = driver.findElement(By.xpath("div[@class='navLeftFooter nav-sprite-v1']//a"));
			System.out.println(footer.getText());
			//div[@class='navLeftFooter nav-sprite-v1']//a
			
			
	}
}
