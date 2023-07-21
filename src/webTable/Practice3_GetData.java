package webTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice3_GetData 
{
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/html/ex5.html");
		
		String text = driver.findElement(By.xpath("//table[@id='1234']//tr[2]/td[1]")).getText();
		System.out.println(text);
		
		String text1 = driver.findElement(By.xpath("//table[@id='1234']//tr[3]/td[3]")).getText();
		System.out.println(text1);
	}

}
