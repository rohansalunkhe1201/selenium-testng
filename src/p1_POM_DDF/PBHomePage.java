package p1_POM_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBHomePage 
{
	WebDriver driver1;
	
	@FindBy(xpath="//div[text()='My Account']")private WebElement MyAccount;
	
	public PBHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		driver1=driver;
	}
	
	public void OpenDDOPBHomePageMyAccount() 
	{
		Actions act=new Actions(driver1);
		act.moveToElement(MyAccount).perform();
	}

}
