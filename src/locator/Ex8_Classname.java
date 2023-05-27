package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex8_Classname 
{
	 public static void main(String[] args)
	    {
		
	    	WebDriver driver=new ChromeDriver();
	    	driver.get("file:///D:/html/classname.html");
	    	
	    	//Enter FN
	    	driver.findElement(By.className("abc123")).sendKeys("rohan");
	    	
	    	//Enter LN
	    	driver.findElement(By.className("abc456")).sendKeys("salunkhe");
	    	
	    	
	    	
	    	
	    	
	    }


}
