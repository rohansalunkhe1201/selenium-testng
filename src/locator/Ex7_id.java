package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex7_id
{
    public static void main(String[] args)
    {
	
    	WebDriver driver=new ChromeDriver();
    	driver.get("file:///D:/html/id.html");
    	
    	//Enter FN
    	driver.findElement(By.id("1234")).sendKeys("rohan");
    	
    	//Enter LN
    	driver.findElement(By.id("5678")).sendKeys("salunkhe");
    	
    	
    	
    	
    	
    }


}
