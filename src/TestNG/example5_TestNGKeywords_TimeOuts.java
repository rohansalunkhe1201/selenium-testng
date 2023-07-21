package TestNG;

import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class example5_TestNGKeywords_TimeOuts 
{
	
	@Test(timeOut=5000)
	public void tc1() throws InterruptedException
	{
		Thread.sleep(7000);
		Reporter.log("---running TC1---",true);
	}

}
