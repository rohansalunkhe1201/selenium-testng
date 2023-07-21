package p1_POM_DDF_TestNG_BaseClass_UtilityClass_CaptureSS_PropertyFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass 
{
	private static final String TakesScreenshot = null;

	public static String GetTestData(int rowindex, int colIndex) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("D:\\excel\\New folder\\Book123.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
		String value = sh.getRow(rowindex).getCell(colIndex).getStringCellValue();
		return value;
	}
	
	public static void CaptureSSOfFailedTC(WebDriver driver, int TCID) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("D:\\screenshots\\TestCaseID"+TCID+".jpg");
		FileHandler.copy(src, dest);
	}
	
	public static String GetPFData(String key) throws IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Lenovo\\git\\repository2\\selenium project\\src\\P1_PropertyFile");
		Properties p=new Properties();
		p.load(file);
		String value = p.getProperty(key);
		return value;
		
	}

}
