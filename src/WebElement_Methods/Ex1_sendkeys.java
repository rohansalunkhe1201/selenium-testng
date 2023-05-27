package WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1_sendkeys
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("rohan");
		
		 WebElement UN = driver.findElement(By.xpath("//input[@type='text']"));
				 UN.sendKeys("rohan");
	}

}
