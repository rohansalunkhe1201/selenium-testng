package webTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex2_GetColSize
{
    public static void main(String[] args)
    {
    	WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/html/ex5.html");
		
		int colsize = driver.findElements(By.xpath("//table[@id='1234']//tr[2]/td")).size();
		System.out.println(colsize);
    }
}
