package POM_DDF_TestNG_BaseClass_UtilityClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBMobNumPage
{
	@FindBy(xpath="(//input[@id='central-login-module-sign-mobile'])[2]") private WebElement mobNum;
	@FindBy(xpath="(//span[text()='Sign in with Password'])[2]") private WebElement signInWithPwd;
	
	
	public PBMobNumPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void inpPBMobNumPageMobNum(String mobilenum)
	{
		mobNum.sendKeys(mobilenum);
	}
	
	public void clickPBMobNumPageSignInWithPwd() 
	{
		signInWithPwd.click();
	}

}
