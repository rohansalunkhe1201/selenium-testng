package HandlingOfDynamicElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1_GetReviewsFromFlipkart 
{
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("oppo f11");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		String reviews = driver.findElement(By.xpath("((//div[@class='_2kHMtA'])[2]//span)[9]")).getText();
		System.out.println(reviews);
		
		
		
	}
}
