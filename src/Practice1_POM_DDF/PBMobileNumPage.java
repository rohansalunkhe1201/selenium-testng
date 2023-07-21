package Practice1_POM_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBMobileNumPage 
{
	@FindBy(xpath="(//input[@id='central-login-module-sign-mobile'])[2]") private WebElement MobNum;
	@FindBy(xpath="(//span[text()='Sign in with Password'])[2]") private WebElement SignInwithPWD;
	
	public PBMobileNumPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void InputPBMobileNumPageMobNum(String MobileNumber) 
	{
		MobNum.sendKeys(MobileNumber);
	}

	public void ClickPBMobileNumPageSignInwithPWD()
	{
		SignInwithPWD.click();
	}
}
