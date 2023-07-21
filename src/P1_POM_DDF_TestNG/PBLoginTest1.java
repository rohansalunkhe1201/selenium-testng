package P1_POM_DDF_TestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PBLoginTest1 
{
	WebDriver driver;
	PBLoginPage Login;
	PBMobNumPage MobNum;
	PBpwdPage pwd;
	PBHomePage Home;
	PBMyAccPage myAcc;
	PBMyProfilePage myProfile;
	Sheet sh;
	private Object expResult;
	private Object actResult;
	
	@BeforeClass
	public void OpenBrowser() throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("D:\\excel\\New folder\\Book123.xlsx");
	    sh = WorkbookFactory.create(file).getSheet("DDF");
		
	    driver=new ChromeDriver();
		driver.get("https://policybazaar.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		 Login=new PBLoginPage(driver);
		 MobNum=new PBMobNumPage(driver);
		 pwd=new PBpwdPage(driver);
		 Home=new PBHomePage(driver);
		 myAcc=new PBMyAccPage(driver);
		 myProfile=new PBMyProfilePage(driver);
		
	}
	
	@BeforeMethod
	public void LoginToApp()
	{
		Login.ClickPBLoginPageSignIn();
		String mobilenum = sh.getRow(0).getCell(0).getStringCellValue();
		MobNum.EnterPBMobNumPageMobNum(mobilenum);
		MobNum.clickPBMobNumPageSignInWithPWD();
		String password = sh.getRow(0).getCell(1).getStringCellValue();
		pwd.EnterPBpwdPagePWD(password);
		pwd.clickPBpwdPageSignIn();
		
	}
	
	@Test
	public void VerifyFullName()
	{
		Home.OpenDDOPBHomePageMyAccount();
		myAcc.clickPBMyAccPageMyProfile();
		myProfile.SwitchToSwitchChindWindow();
		
		String expText = sh.getRow(0).getCell(2).getStringCellValue();
		String ActText = myProfile.GetPBMyProfilePageFullName();
		Assert.assertEquals(actResult, expResult,"Failed: both results are diff-: ");
	}
	
	@AfterMethod
	public void LogOutFromApp()
	{
		
	}
	
	@AfterClass
	public void CloseBrowser()
	{
		driver.quit();
	}
}
