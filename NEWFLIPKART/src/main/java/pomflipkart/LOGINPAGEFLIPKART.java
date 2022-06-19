package pomflipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LOGINPAGEFLIPKART {
	@FindBy (xpath = "(//input [@type='text'])[2]")
	private WebElement  MobileNo;

	@FindBy (xpath = "//input [@type='password']")
	private WebElement Password;

	@FindBy (xpath = "(//button[@type='submit'])[2]")
	private WebElement button;

	
	public LOGINPAGEFLIPKART(WebDriver driver123)
	{
		PageFactory.initElements(driver123, this);
	}
	
	public void sendMobileNo(String MobNo)
	{
		MobileNo.clear();
		MobileNo.sendKeys(MobNo);
	}
	public void sendPassword(String PassWord)
	{
		Password.clear();
		Password.sendKeys(PassWord);
	}
	public void clickOnloginsButton()
	{
		button.click();
	}
}
