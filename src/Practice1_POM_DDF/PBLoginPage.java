package Practice1_POM_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBLoginPage  
{
	@FindBy(xpath="//a[@class='sign-in']") private WebElement SignIN;
	
	public PBLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void ClickPBLoginPageSignIN()
	{
		SignIN.click();
	}

}
