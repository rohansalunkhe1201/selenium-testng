package POM_With_Pagefactory1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBMyAccPage 
{
  @FindBy(xpath="//input[text='My Account']")private WebElement MyProfile;
  
  public PBMyAccPage(WebDriver driver)
  {
	  PageFactory.initElements(driver, this);
  }
  
  public void clickPBMyAccPageMyProfile()
  {
	  MyProfile.click();
  }
  
  
}
