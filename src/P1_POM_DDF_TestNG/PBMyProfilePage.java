package P1_POM_DDF_TestNG;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBMyProfilePage 
{
	@FindBy(xpath="//input[@name='personName']")private WebElement FullName;
	WebDriver driver1;
	
	public PBMyProfilePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		driver1=driver;
	}
	
	public void SwitchToSwitchChindWindow()
	{
		Set<String> allIds = driver1.getWindowHandles();
		ArrayList<String> al=new ArrayList<>(allIds);
		driver1.switchTo().window(al.get(1));
	}
	
	public String GetPBMyProfilePageFullName()
	{
		String ActText = FullName.getAttribute("value");
		return ActText;
		
	}

}
