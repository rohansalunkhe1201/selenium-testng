package Practice1_POM_DDF;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM_DDF.PBMobNumPage;
import POM_With_Pagefactory1.MyProfilePage;

public class PBLoginTest 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
		FileInputStream file=new FileInputStream("D:\\\\New folder\\\\book1.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.policybazaar.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		
		PBLoginPage Login=new PBLoginPage(driver);
		Login.ClickPBLoginPageSignIN();
		
		Thread.sleep(2000);
		PBMobNumPage MobNum=new PBMobNumPage(driver);
		String MobileNumber = sh.getRow(0).getCell(0).getStringCellValue();
		MobNum.inpPBMobNumPageMobNum(MobileNumber);
		MobNum.clickPBMobNumPageSignInWithPwd();
		Thread.sleep(2000);
		
		PBpwdPage PWD=new PBpwdPage(driver);
		String password = sh.getRow(0).getCell(1).getStringCellValue();
		PWD.InputPBpwdPagepwd(password);
		PWD.ClickPBpwdPageSignIN();
		Thread.sleep(2000);
		
		PBHomePage Home=new PBHomePage(driver);
		Home.OpenDDOptionPBHomePageMYAcc();
		
		PBMyAccPage MyAcc=new PBMyAccPage(driver);
		MyAcc.clickPBMyAccPageMyProfile();
		
		Thread.sleep(2000);
		PBProfilePage Profile=new PBProfilePage(driver);
		Profile.SwitchToSwitchChildWindow();
		String expName = sh.getRow(0).getCell(2).getStringCellValue();
		Profile.VerifyPBProfilePageFullName(expName);
		
		driver.quit();
		
		
		
		
	}
	

}
