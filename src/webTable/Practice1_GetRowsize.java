package webTable;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1_GetRowsize 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/html/ex5.html");
		
		 int rowsize = driver.findElements(By.xpath("//table[@id='1234']//tr")).size();
		 
		 System.out.println(rowsize);
		
		
		
		
		
	}

}
