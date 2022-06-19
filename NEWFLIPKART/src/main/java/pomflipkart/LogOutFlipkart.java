package pomflipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOutFlipkart {
	Actions act;
	@FindBy (xpath = "//div[text()='My Account']")
	private WebElement myAccount;
	
	
	@FindBy (xpath = "//div[text()='Logout']")
	private WebElement logOut;
	
	
	public LogOutFlipkart(WebDriver driver123)
	{
		PageFactory.initElements(driver123, this);
		 act = new Actions(driver123);

	}
	
	public void moveToMyAcoount()
	{
		act.moveToElement(myAccount).perform();
	}
	
	public void clickonLogOut()
	{
		logOut.click();
	}
}
