package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class example5_TestNGKeyword5_dependsOnMethod 
{
	@Test
	public void Login()
	{
		Reporter.log("---Running Login TC---",true);
	}
	
	@Test(dependsOnMethods="Login")
	public void LogOut()
	{
		Reporter.log("---Running LogOut TC---",true);
	}
	

}
