package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Example7_AssertClass1_AssertEquals 
{
	@Test
	public void TC1()
	{
		String ActualResult = "hello";
		String ExpectedResult = "hii";
		
		Assert.assertEquals(ActualResult, ExpectedResult,"Failed: both results are diff- ");
	}

}
