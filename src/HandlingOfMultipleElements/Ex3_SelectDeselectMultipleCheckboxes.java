package HandlingOfMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex3_SelectDeselectMultipleCheckboxes
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("D:\\html/multipleCheckbox.html");
		
		List<WebElement> allcheckboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println(allcheckboxes.size());
		
		for(WebElement s1:allcheckboxes)
		{
		      s1.click();
		      Thread.sleep(2000);
		}
		for(int i=allcheckboxes.size()-1; i>=0; i--)
		{
			allcheckboxes.get(i).click();
			Thread.sleep(2000);
		}
	}

}
