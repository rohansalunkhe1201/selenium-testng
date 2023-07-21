package POM_With_Pagefactory1;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyProfilePage 
{
	@FindBy(xpath="//input[@name='personName']")private WebElement FullName;
	WebDriver driver1;
	
	public MyProfilePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		driver=driver1;
	}
	
	public void SwitchToSwitchChildWindow()
	{
	   String allIDs = driver1.getWindowHandle();
	   ArrayList<String> al=new ArrayList<String>();
	   driver1.switchTo().window(al.get(1));
	}
	
	public void verifyPBProfilePageFullName()
	{
		String acttext = FullName.getAttribute("value");
		String exptext = "Jan batch";
		
		
		if(acttext.equals(exptext))
		{
			System.out.println("TC Pass");
		}
		else
		{
			System.out.println("TC Fail");
		}
	}

}
