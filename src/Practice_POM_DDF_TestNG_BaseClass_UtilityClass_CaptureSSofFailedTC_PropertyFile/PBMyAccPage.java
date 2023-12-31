package Practice_POM_DDF_TestNG_BaseClass_UtilityClass_CaptureSSofFailedTC_PropertyFile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBMyAccPage
{
	@FindBy(xpath = "//span[text()=' My profile ']") private WebElement myProfile;
	@FindBy(xpath = "//span[text()='Sign out']") private WebElement signOut;
	
	public PBMyAccPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickPBMyAccPageMyProfile() 
	{
		myProfile.click();
	}
	
	public void clickPBMyAccPageSignOut() 
	{
		signOut.click();
	}

}
