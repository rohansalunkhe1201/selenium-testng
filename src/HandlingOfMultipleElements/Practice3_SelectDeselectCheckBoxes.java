package HandlingOfMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice3_SelectDeselectCheckBoxes 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("D:\\html/multipleCheckbox.html");
		
		List<WebElement> allcheckbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println(allcheckbox.size());
		
		for(int i=0;i<=5;i++)
		{
			allcheckbox.get(i).click();
		}
		
		for(int i=5;i>=0;i--)
		{
			allcheckbox.get(i).click();
		}
		
	}

}
