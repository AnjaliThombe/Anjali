package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Browser {

	public static WebDriver LaunchChromeBrowser() {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\Download\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		return driver;
		
		public static WebDriver LaunchFirefoxBrowser() {
			System.setProperty("","");
			WebDriver driver = new FirefoxDriver();
			return driver;
			
		public static WebDriver LaunchOperaBrowser() {
				System.setProperty("","");
				WebDriver driver = new OperaDriver();
				return driver;
		}
		
	}

}
