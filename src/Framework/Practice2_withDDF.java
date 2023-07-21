package Framework;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practice2_withDDF 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
		FileInputStream file=new FileInputStream("D:\\\\New folder\\\\book1.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.policybazaar.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//click on sign-in btn
		driver.findElement(By.xpath("//a[@class='sign-in']")).click();
		
		//enter mobile no
		String mobnum = sh.getRow(0).getCell(0).getStringCellValue();
		driver.findElement(By.xpath("(//input[@id='central-login-module-sign-mobile'])[2]")).sendKeys(mobnum);
		
		//click on sign-in with pwd
		driver.findElement(By.xpath("(//span[text()='Sign in with Password'])[2]")).click();
		
		//enter pwd
		String pwd = sh.getRow(0).getCell(1).getStringCellValue();
	    driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pwd);
	    
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
        String Exptext = sh.getRow(0).getCell(2).getStringCellValue();
        
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
