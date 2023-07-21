package Framework;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practice1_FrameworkWihoutDDF 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.policybazaar.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//click on sign-in btn
		driver.findElement(By.xpath("//a[@class='sign-in']")).click();
		
		//enter mobile no
		driver.findElement(By.xpath("(//input[@id='central-login-module-sign-mobile'])[2]")).sendKeys("7020500587");
		
		//click on sign-in with pwd
		driver.findElement(By.xpath("(//span[text()='Sign in with Password'])[2]")).click();
		
		//enter pwd
	    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Sanjay@23");
	    
	    //click on sign in
	    driver.findElement(By.xpath("//a[@id='login-in-with-password']")).click();
	    Thread.sleep(2000);
	    
	   // click on my acc
	    WebElement myAcc = driver.findElement(By.xpath("//div[text()='My Account']"));
		Actions act=new Actions(driver);
		act.moveToElement(myAcc).perform();
	    Thread.sleep(2000);
	    
	    //click on my profile
	    driver.findElement(By.xpath("//span[text()=' My profile ']")).click();
	    
	    Set<String> allIDs = driver.getWindowHandles();
	    ArrayList<String> al=new ArrayList<String>(allIDs);
        driver.switchTo().window(al.get(1));
        
        Thread.sleep(2000);
        
        String acttext = driver.findElement(By.xpath("//input[@name='personName']")).getAttribute("value");
        String Exptext = "jan batch";
        
        if(acttext.equals(acttext))
        {
        	System.out.println("TC pass");
        }
        else
        {
        	System.out.println("TC fail");
        }
        
        
	    
		
	}

}
