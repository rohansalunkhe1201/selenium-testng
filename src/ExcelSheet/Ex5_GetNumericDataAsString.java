package ExcelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ex5_GetNumericDataAsString 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
	    FileInputStream file=new FileInputStream("D:\\New folder\\book1.xlsx");
	    
	   String value = WorkbookFactory.create(file).getSheet("sheet2").getRow(0).getCell(0).getStringCellValue();
	    
		System.out.println(value);
		
	}

}
