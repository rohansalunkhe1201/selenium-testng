package p1_POM_DDF;

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
	
	public void verifyPBMyProfilePageFullName(String ExpText)
	{
		String ActText = FullName.getAttribute("value");
		
		if(ActText.equals(ExpText))
		{
			System.out.println("Test Case Pass");
		}
		else
		{
			System.out.println("Test Case fail");
		}
		
	}

}
