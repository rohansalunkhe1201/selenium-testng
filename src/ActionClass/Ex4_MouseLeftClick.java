package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex4_MouseLeftClick 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		Thread.sleep(2000);
		
		WebElement cart = driver.findElement(By.xpath("//span[text()='cart']"));
		
		Actions act=new Actions(driver);
		//act.moveToElement(cart).perform();
	//	act.click().perform();
	//	act.moveToElement(cart).click().perform();
		Thread.sleep(2000);
		
		act.click(cart).perform();
		
		
		
		
	}

}
