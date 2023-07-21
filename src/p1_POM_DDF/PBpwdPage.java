package p1_POM_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBpwdPage 
{
	@FindBy(xpath="//input[@name='password']")private WebElement PWD;
	@FindBy(xpath="//span[text()='Sign in']") private WebElement SignIn;
	
	public PBpwdPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void EnterPBpwdPagePWD(String password)
	{
		PWD.sendKeys(password);
	}
	
	public void clickPBpwdPageSignIn()
	{
		SignIn.click();
	}

}
