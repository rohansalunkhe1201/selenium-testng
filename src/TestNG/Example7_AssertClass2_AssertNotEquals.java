package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Example7_AssertClass2_AssertNotEquals 
{
	@Test
	public void TC2()
	{
		
		String ActualResult = "hii";
		String ExpectedResult = "hii";
		
		Assert.assertNotEquals(ActualResult, ExpectedResult, "Failed: both results are same:");
	}

}
