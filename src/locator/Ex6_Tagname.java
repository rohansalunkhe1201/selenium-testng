package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex6_Tagname 
{
    public static void main(String[] args)
    {
	
    	WebDriver driver=new ChromeDriver();
    	driver.get("file:///D:/html/tagname.html");
    	
    	//Enter FN
    	driver.findElement(By.tagName("input")).sendKeys("rohan");
    	
    	//Enter LN
    	driver.findElement(By.tagName("input")).sendKeys("salunkhe");
    	
    	
    	
    	
    	
    }
}
