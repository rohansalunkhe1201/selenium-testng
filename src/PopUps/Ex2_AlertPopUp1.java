package PopUps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex2_AlertPopUp1
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("111");
		
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		//get text from alert pop-up
		String text = driver.switchTo().alert().getText();
		System.out.println(text);
		
		//click on cancel button from alert pop-up
		//driver.switchTo().alert().dismiss();
		
		//click on ok button from 1st alert pop-up
		driver.switchTo().alert().accept();
		
		//click on ok button from 2nd alert pop-up
		driver.switchTo().alert().accept();
	}

}
