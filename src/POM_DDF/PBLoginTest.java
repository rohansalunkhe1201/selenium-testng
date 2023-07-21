package POM_DDF;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PBLoginTest 
{
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{	
		FileInputStream file=new FileInputStream("D:\\New folder\\book1.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.policybazaar.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		PBLoginPage login=new PBLoginPage(driver);
		login.clickPBLoginPageSignIN();
		
		PBMobNumPage mobNum=new PBMobNumPage(driver);
		String mobilenum = sh.getRow(0).getCell(0).getStringCellValue();
		mobNum.inpPBMobNumPageMobNum(mobilenum);
		mobNum.clickPBMobNumPageSignInWithPwd();
		Thread.sleep(2000);
		
		PBpwdPage pwd=new PBpwdPage(driver);
		String password = sh.getRow(0).getCell(1).getStringCellValue();
		pwd.inpPBPwdPagePWD(password);
		pwd.clickPBPwdPageSignIn();
		Thread.sleep(2000);
		
		PBHomePage home=new PBHomePage(driver);
		home.openDDOptionPBHomePageMyAcc();
		Thread.sleep(2000);
		
		PBMyAccPage myAcc=new PBMyAccPage(driver);
		myAcc.clickPBMyAccPageMyProfile();
		Thread.sleep(2000);
		
		PBProfilePage profile=new PBProfilePage(driver);
		profile.switchToSwitchChildWindow();
		
		String exptext = sh.getRow(0).getCell(2).getStringCellValue();
		profile.verifyPBProfilePageFullName(exptext);
		Thread.sleep(2000);
		
		driver.quit();	
	}

}
