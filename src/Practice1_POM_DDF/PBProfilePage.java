package Practice1_POM_DDF;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBProfilePage
{
	@FindBy(xpath="//input[@name='personName']")private WebElement FullName;
	WebDriver driver1;
	
	public PBProfilePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		driver1=driver;
	}
	
	public void SwitchToSwitchChildWindow()
	{
		Set<String> allIDs = driver1.getWindowHandles();
		ArrayList<String> al=new ArrayList<String>(allIDs);
		driver1.switchTo().window(al.get(1));
	}
	
	public void VerifyPBProfilePageFullName(String expName)
	{
		String ActName = FullName.getAttribute("value");
		
		if(ActName.equals(expName))
		{
			System.out.println("TC Pass");
		}
		else
		{
			System.out.println("TC Fail");
		}
	}
	
}
