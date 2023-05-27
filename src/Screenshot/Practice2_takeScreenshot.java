package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Practice2_takeScreenshot 
{
	public static void main(String[] args) throws IOException
	{
		WebDriver driver=new ChromeDriver();
	     driver.get("https://www.flipkart.com/");
	     String RS = RandomString.make(3);
	     
	     File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	     System.out.println(src);
	     
	     File dest=new File("D:\\screenshots\\abc2"+RS+".jpg");
	     FileHandler.copy(src, dest);
	     
		
	}

}
