package PopUps;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.apache.pdfbox.printing.Scaling;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice4_SwitchToMainPageFromChildWindow 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https:skpatro.github.io/demo/links/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//input[@name='NewTab']")).click();
		
		Set<String> allIds = driver.getWindowHandles();
		ArrayList<String> al=new ArrayList<String>(allIds);
		
		driver.switchTo().window(al.get(1));
		
		driver.findElement(By.xpath("//span[text()='Training'][1]")).click();
		
		Thread.sleep(2000);
		
		driver.switchTo().window(al.get(0));
		
		driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
		
		
		
		
		
		
	}

}
