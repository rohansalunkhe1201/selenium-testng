package webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example5_getUrl 
{
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bing.com/search?q=facebook");
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		
	}
	

}
