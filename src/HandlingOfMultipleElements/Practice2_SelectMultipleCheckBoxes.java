package HandlingOfMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice2_SelectMultipleCheckBoxes 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("D:\\html/multipleCheckbox.html");
		
		List<WebElement> allCheckBoxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println(allCheckBoxes.size());
		
		for(int i=0; i<=allCheckBoxes.size()-1; i++)
		{
			allCheckBoxes.get(i).click();
			Thread.sleep(2000);
		}
		
	}

}
