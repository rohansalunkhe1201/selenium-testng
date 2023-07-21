package webTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1_GetRowSize 
{
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/html/ex5.html");
		
	//List<WebElement> allrows = driver.findElements(By.xpath("//table[@id='1234']//tr"));
    //     int size = allrows.size();
     //    System.out.println(size);
         
         int rowsize = driver.findElements(By.xpath("//table[@id='1234']//tr")).size();
		System.out.println(rowsize);
	}

}
