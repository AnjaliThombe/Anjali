package firstesting;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Anjali {

public static void main(String[] args) throws InterruptedException, IOException {

System.setProperty("webdriver.chrome.driver","\\D:\\Download\\chromedriver_win32\\chromedriver.exe\\");
WebDriver driver = new ChromeDriver();
driver.get("https://www.facebook.com/");
for(int c=0; c<=5; c++)
{

SimpleDateFormat formate =  new SimpleDateFormat("dd.MM.yyyy HH.mm.ss");
Date date = new Date();
String k =formate.format(date);

File src= ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
File dest=new File("D:\\ScreenShot Selenium\\anjali"+k+".jpg");
FileHandler.copy(src, dest);
Thread.sleep(2000);
}

//WebElement username= driver.findElement(By.xpath(null));
//username.sendKeys("anjalithombe4545@gmail.com");


//driver.manage().window().maximize();
//
//Thread.sleep(3000);
//
//driver.navigate().to("https://www.facebook.com/");
//Thread.sleep(3000);
//
//driver.navigate().back();
//Thread.sleep(3000);
//
//
//driver.navigate().forward();
//Thread.sleep(3000);
//
//driver.navigate().refresh();
//Thread.sleep(3000);

}
}

