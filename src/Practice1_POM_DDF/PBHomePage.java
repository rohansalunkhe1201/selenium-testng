package Practice1_POM_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBHomePage 
{
	@FindBy(xpath="//div[text()='My Account']")private WebElement MyAcc;
	WebDriver driver1;
	
	public PBHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		driver1=driver;
	}
	
    public void OpenDDOptionPBHomePageMYAcc()
    {
    	Actions act=new Actions(driver1);
    	act.moveToElement(MyAcc);
    }
}
