package HandlingOfDynamicElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice2_GetRatingsFromFlipkart 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("oppo f11");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		String ratings = driver.findElement(By.xpath("((//div[@class='_2kHMtA'])[2]//span)[7]")).getText();
        System.out.println(ratings);
		
	}

}
