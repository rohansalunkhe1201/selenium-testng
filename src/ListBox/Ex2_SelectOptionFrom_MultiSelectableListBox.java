package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ex2_SelectOptionFrom_MultiSelectableListBox 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("D:\\html/ex4.html");
		
		WebElement selectcountry = driver.findElement(By.xpath("//select[@id='1234']"));
		
		Select s=new Select(selectcountry);
		
	s.selectByVisibleText("aus");
	//	s.selectByValue("");
	//	s.selectByIndex(3);
		
		
		
	}

}
