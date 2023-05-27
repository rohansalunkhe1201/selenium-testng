package PopUps;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex2_AlertPopUp2 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("111");
		
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		 Alert alt = driver.switchTo().alert();
		
				 String text = alt.getText();
			     System.out.println(text);
			     
			//  alt.dismiss();  
			  alt.accept();
			  alt.accept();
		
	}

}
