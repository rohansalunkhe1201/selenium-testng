package p1_POM_DDF_TestNG_BaseClass_UtilityClass_CaptureSS_PropertyFile;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass 
{
	
	WebDriver driver;
	public void InitializeBrowser()
	{
		
		driver=new ChromeDriver();
		driver.get("https://policybazaar.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		
	}

}
