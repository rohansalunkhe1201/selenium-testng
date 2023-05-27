package ExcelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ex3_GetBooleanData
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("D:\\New folder\\book1.xlsx");
		boolean value = WorkbookFactory.create(file).getSheet("sheet1").getRow(0).getCell(2).getBooleanCellValue();
		System.out.println(value);
		
		
		
		
	}

}
