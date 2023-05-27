package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex9_Name 
{
	public static void main(String[] args)
    {
	
    	WebDriver driver=new ChromeDriver();
    	driver.get("file:///D:/html/name.html");
    	
    	//Enter FN
    	driver.findElement(By.name("xyz123")).sendKeys("rohan");
    	
    	//Enter LN
    	driver.findElement(By.name("xyz456")).sendKeys("salunkhe");
    	
    	
    	
    	
    	
    }


}
