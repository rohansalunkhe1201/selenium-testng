package P1_POM_DDF_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBMobNumPage 
{
	@FindBy(xpath="(//input[@id='central-login-module-sign-mobile'])[2]") private WebElement MobNum;
	@FindBy(xpath="(//span[text()='Sign in with Password'])[2]") private WebElement SignInWithPWD;
	
	public PBMobNumPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void EnterPBMobNumPageMobNum(String mobilenum)
	{
		MobNum.sendKeys(mobilenum);
	}
	
	public void clickPBMobNumPageSignInWithPWD()
	{
		SignInWithPWD.click();
	}
	
	
}
