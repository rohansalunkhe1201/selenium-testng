package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Practice7_1_GetAllDataInCol 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("D:\\\\New folder\\\\book1.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("sheet3");
		int lastrowindex = sh.getLastRowNum();
		
		for(int i=0;i<=lastrowindex;i++)
		{
			String value = sh.getRow(i).getCell(0).getStringCellValue();
			System.out.println(value);
		}
	}
}
