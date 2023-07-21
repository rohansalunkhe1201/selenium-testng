package POM_DDF_TestNG_BaseClass_UtilityClass;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class UtilityClass
{
	
	//@AuthorName: rohan
		//This method is use to get Test data from excel.
		//need to pass 2 inputs: 1-rowIndex, 2-colIndex
		public static String getTestData(int rowIndex, int colIndex) throws EncryptedDocumentException, IOException
		{
			FileInputStream file=new FileInputStream("D:\\excel\\New folder\\Book123.xlsx");
			Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
			String value = sh.getRow(rowIndex).getCell(colIndex).getStringCellValue();
			
			return value;
		}

}