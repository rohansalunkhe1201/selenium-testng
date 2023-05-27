package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ex3_IsMultiple2 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		
		WebElement selectdropdown = driver.findElement(By.xpath("//div[@class='css-1hwfws3']"));
		
		
		Select s=new Select(selectdropdown);
		boolean result = s.isMultiple();
		System.out.println(result);
		
		if(result)
		{
			System.out.println("listbox is multi-selectable");
		}
		
		else
		{
			System.out.println("listbox is single-selectable");
		}
		
	}
}
