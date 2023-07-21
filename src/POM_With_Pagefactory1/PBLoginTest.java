package POM_With_Pagefactory1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM_With_PageFactory.PBHomePage;

public class PBLoginTest 
{

	public static void main(String[] args) throws InterruptedException
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.policybazaar.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		PBLoginPage login=new PBLoginPage(driver);
		login.clickPBLoginPageSignIN();
		
		Thread.sleep(2000);
		
		PBMobNumPage mob=new PBMobNumPage(driver);
		mob.enterPBMobNumPageMobNum();
		mob.ClickPBMobNumPageSignINwithPwd();
		
		PBpwdPage pwd=new PBpwdPage(driver);
		pwd.enterPBpwdPagepwd();
	    pwd.clickPBpwdPageSignIn();
		
		PBHomePage HomePage=new PBHomePage(driver);
		HomePage.openDDOptionPBHomePageMyAcc();
		Thread.sleep(2000);
		
		
		PBMyAccPage MyAcc=new PBMyAccPage(driver);
		MyAcc.clickPBMyAccPageMyProfile();
		Thread.sleep(2000);
		
		MyProfilePage MyProfile=new MyProfilePage(driver);
		MyProfile.SwitchToSwitchChildWindow();
		MyProfile.verifyPBProfilePageFullName();
		Thread.sleep(2000);
		
		driver.quit();
		
		
		
		
		
		
		
		
	}
}
