package Practice_POM_DDF_TestNG;

import static org.testng.Assert.assertEquals;

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
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POM_DDF.PBHomePage;
import POM_DDF.PBLoginPage;
import POM_DDF.PBMobNumPage;
import POM_DDF.PBMyAccPage;
import POM_DDF.PBProfilePage;
import POM_DDF.PBpwdPage;

public class PBLoginTest1 
{
	int a;       //declare globally 
	PBLoginPage login;
	PBMobNumPage mobNum;
	PBpwdPage pwd;
	PBHomePage home;
	PBMyAccPage myAcc;
	PBProfilePage profile;
	Sheet sh;
	WebDriver driver;
	
	@BeforeClass
	public void openBrowser() throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("D:\\\\New folder\\\\book1.xlsx");
		sh = WorkbookFactory.create(file).getSheet("DDF");
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.policybazaar.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		 login=new PBLoginPage(driver);
		 mobNum=new PBMobNumPage(driver);
		 pwd=new PBpwdPage(driver);
		 home=new PBHomePage(driver);
		 myAcc=new PBMyAccPage(driver);
		 profile=new PBProfilePage(driver);
		 a=10;               //initialize locally
	}
	
	@BeforeMethod
	public void loginToApp() throws InterruptedException 
	{
		System.out.println(a);
		login.clickPBLoginPageSignIN();
		mobNum.inpPBMobNumPageMobNum(sh.getRow(0).getCell(0).getStringCellValue());
		mobNum.clickPBMobNumPageSignInWithPwd();
		pwd.inpPBPwdPagePWD(sh.getRow(0).getCell(1).getStringCellValue());
		pwd.clickPBPwdPageSignIn();
		Thread.sleep(3000);
	}
	
	
	@Test
	public void verifyFullName() throws InterruptedException
	{
		home.openDDOptionPBHomePageMyAcc();
		Thread.sleep(2000);
		myAcc.clickPBMyAccPageMyProfile();
		profile.switchToSwitchChildWindow();
		//profile.verifyPBProfilePageFullName(sh.getRow(0).getCell(2).getStringCellValue());
		
		String actResult=profile.getPBProfilePageFullName();
		String expResult=sh.getRow(0).getCell(2).getStringCellValue();
		Assert.assertEquals(actResult, expResult,"Failed: both results are diff-: ");
	}
	
	@AfterMethod
	public void logoutFromApp() 
	{
		
	}
	
	@AfterClass
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.quit();		
	}
}
