package POM_With_Pagefactory1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBMobNumPage 
{
     @FindBy(xpath="(//input[@id='central-login-module-sign-mobile'])[2]")private WebElement MobNum;
     @FindBy(xpath="(//span[text()='Sign in with Password'])[2]")private WebElement SignINwithPwd;
     
     public PBMobNumPage(WebDriver driver)
     {
    	 PageFactory.initElements(driver, this);
     }
     
     public void enterPBMobNumPageMobNum()
     {
    	 MobNum.sendKeys("7020500587");
     }
     
     public void ClickPBMobNumPageSignINwithPwd()
     {
    	 SignINwithPwd.click();
     }
}
