package POM_DDF;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBProfilePage 
{
	@FindBy(xpath = "//input[@name='personName']") private WebElement fullName;
	WebDriver driver1;

	
	public  PBProfilePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		driver1=driver;
	}
	
	public void switchToSwitchChildWindow()
	{
		Set<String> allIds = driver1.getWindowHandles();
		ArrayList<String> al=new ArrayList<>(allIds);
		driver1.switchTo().window(al.get(1));
	}
	
	public void verifyPBProfilePageFullName(String ExpText)
	{
		String ActText = fullName.getAttribute("value");
		
		if(ActText.equals(ExpText))
		{
			System.out.println("Test Case: Pass");
		}
		else
		{
			System.out.println("Test Case: Fail");
		}
	}

	

	
	
	
	

}
