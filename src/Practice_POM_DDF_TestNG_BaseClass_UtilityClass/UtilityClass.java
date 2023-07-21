package Practice_POM_DDF_TestNG_BaseClass_UtilityClass;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class UtilityClass 
{

	public static String GetTestData(int Rowindex,int ColIndex) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("D:\\\\New folder\\\\book1.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
		String Value = sh.getRow(Rowindex).getCell(ColIndex).getStringCellValue();
		return Value;
	}
}
