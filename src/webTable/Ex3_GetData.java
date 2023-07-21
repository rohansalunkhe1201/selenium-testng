package webTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex3_GetData 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/html/ex5.html");
		
		String text = driver.findElement(By.xpath("//table[@id='1234']//tr[4]/td[3]")).getText();
		System.out.println(text);
		
		//for header
		String text1 = driver.findElement(By.xpath("//table[@id='1234']//tr[1]/th[2]")).getText();
		System.out.println(text1);
	}

}
