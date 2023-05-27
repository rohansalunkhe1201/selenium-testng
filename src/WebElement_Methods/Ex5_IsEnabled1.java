package WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex5_IsEnabled1 
{public static void main(String[] args) throws InterruptedException 
  {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	
	boolean result = driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']")).isEnabled();
	System.out.println(result);
	
	
	
	if(result)
	{
		System.out.println("is enabled");
	}
	else
	{
		System.out.println("is disabled");
	}
	
  }
}
