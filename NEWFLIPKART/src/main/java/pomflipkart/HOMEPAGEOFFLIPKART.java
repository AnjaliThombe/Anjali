package pomflipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HOMEPAGEOFFLIPKART {
		@FindBy (xpath = "//input[@class='_3704LK']")
		private WebElement SearchText;
		
		@FindBy (xpath = "//button[@class='L0Z3Pu']")
		private WebElement buttonn;
		
		public HOMEPAGEOFFLIPKART(WebDriver driver123)
		{
			PageFactory.initElements(driver123, this);
		}
		
		public void sendText(String text)
		{
			SearchText.sendKeys(text);
		}
		public void searchButton()
		{
			buttonn.click();
		}
}
