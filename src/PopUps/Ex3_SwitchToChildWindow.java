package PopUps;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex3_SwitchToChildWindow 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https:skpatro.github.io/demo/links/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//click on new tab from main page
		driver.findElement(By.xpath("//input[@name='NewTab']")).click();
		
		//get child window id
		Set<String> allIDs = driver.getWindowHandles(); //(main page ID, childwindowID)
		ArrayList<String> al=new ArrayList<String>(allIDs); //(main page ID(0),child window ID(1))
		String childwindowID = al.get(1);
		
		//switch to child window
		driver.switchTo().window(childwindowID);  //string child window id
		
		//click on training link from child window
		driver.findElement(By.xpath("//span[text()='Training'])[1]")).click();
		
		
		
	}

}
