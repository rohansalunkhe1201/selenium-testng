package HandlingOfDynamicElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex2_GetRatinsFromFlipkartApp 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//click on close button
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		Thread.sleep(2000);
		//enter mobile no
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("redmi 9 power");
		
		//click on submit btn
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//get ratings
		String ratings = driver.findElement(By.xpath("((//div[@class='_2kHMtA'])//span)[6]")).getText();
		System.out.println(ratings);
		
	}

}
