package Practice1_POM_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBpwdPage 
{
  @FindBy(xpath="//input[@id='central-login-password']") private WebElement pwd;
  @FindBy(xpath="//span[text()='Sign in']") private WebElement SignIN;
  
  public PBpwdPage(WebDriver driver)
  {
	  PageFactory.initElements(driver, this);
  }
  
  public void InputPBpwdPagepwd(String password )
  {
	  pwd.sendKeys(password);
  }
  
  public void ClickPBpwdPageSignIN()
  {
	  SignIN.click();
  }
  
}
