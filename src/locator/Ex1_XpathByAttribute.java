package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1_XpathByAttribute 
{
	public static void main(String[] args) throws InterruptedException
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//enter User Name
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("7744857532");
		
		Thread.sleep(2000);
		
		//Enter Password
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("abc");
		
		Thread.sleep(2000);
		
		//click on button
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
	}

}
