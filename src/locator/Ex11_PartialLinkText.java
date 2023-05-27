package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex11_PartialLinkText 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/html/partialtext_linktext.html");
		
		Thread.sleep(2000);
		
		//click on facebook link
		driver.findElement(By.partialLinkText("Face")).click();
		
	}


}
