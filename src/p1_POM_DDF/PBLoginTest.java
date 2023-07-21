package p1_POM_DDF;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PBLoginTest
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException
	{
		
		FileInputStream file=new FileInputStream("D:\\excel\\New folder\\Book123.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
		
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://policybazaar.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		PBLoginPage Login=new PBLoginPage(driver);
		Login.ClickPBLoginPageSignIn();
		Thread.sleep(2000);
		
		PBMobNumPage MobNum=new PBMobNumPage(driver);
		String mobilenum = sh.getRow(0).getCell(0).getStringCellValue();
		MobNum.EnterPBMobNumPageMobNum(mobilenum);
		MobNum.clickPBMobNumPageSignInWithPWD();
		Thread.sleep(2000);
		
		PBpwdPage pwd=new PBpwdPage(driver);
		String password = sh.getRow(0).getCell(1).getStringCellValue();
		pwd.EnterPBpwdPagePWD(password);
		pwd.clickPBpwdPageSignIn();
		Thread.sleep(2000);
		
		PBHomePage Home=new PBHomePage(driver);
		Home.OpenDDOPBHomePageMyAccount();
		Thread.sleep(2000);
		
		PBMyAccPage myAcc=new PBMyAccPage(driver);
		myAcc.clickPBMyAccPageMyProfile();
		Thread.sleep(2000);
		
		PBMyProfilePage myProfile=new PBMyProfilePage(driver);
		String expText = sh.getRow(0).getCell(2).getStringCellValue();
		myProfile.SwitchToSwitchChindWindow();
		myProfile.verifyPBMyProfilePageFullName(expText);
		Thread.sleep(2000);
		
		driver.quit();
		
		
		
		
		
		
		
	}
	

}
