package WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex2_Clear 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
	//	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("rohan");
	//	Thread.sleep(2000);
		
	//	driver.findElement(By.xpath("//input[@type='text']")).clear();
	//	Thread.sleep(2000);
		
	//	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("manish");
		
		
		
		WebElement UN = driver.findElement(By.xpath("//input[@type='text']"));
		 UN.sendKeys("rohan");
		 Thread.sleep(2000);
		 UN.clear();
		 Thread.sleep(2000);
		 UN.sendKeys("manish");
		
	}

}
