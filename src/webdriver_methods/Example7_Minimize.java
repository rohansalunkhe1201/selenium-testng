package webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example7_Minimize 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bing.com/search?q=facebook");
		
		Thread.sleep(2000);
		
		
		driver.manage().window().minimize();
		
	}

}
