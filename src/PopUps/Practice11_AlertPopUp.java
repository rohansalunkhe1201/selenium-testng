package PopUps;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice11_AlertPopUp 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("123");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		Alert alt = driver.switchTo().alert();
		
	    alt.dismiss();
		
	}

}
