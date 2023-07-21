package POM_With_PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBpwdPage
{
	@FindBy(xpath = "//input[@name='password']") private WebElement pwd;
	@FindBy(xpath = "//span[text()='Sign in']")private WebElement signIn;
	
	
	public PBpwdPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void inpPBPwdPagePWD() 
	{
		pwd.sendKeys("Sanjay@23");
	}
	
	public void clickPBPwdPageSignIn()
	{
		signIn.click();
	}
	

}
