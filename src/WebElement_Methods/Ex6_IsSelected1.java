package WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex6_IsSelected1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//click on new acc link
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		Thread.sleep(2000);
		
		WebElement maleradiobtn = driver.findElement(By.xpath("(//input[@class='_8esa'])[2]"));
				maleradiobtn.click();
				
				boolean result = maleradiobtn.isSelected();
		
		
		if(result)
		{
			System.out.println("radio button selected");
		}
		else
		{
			System.out.println("radio button de-selected");
		}
	}	

}
