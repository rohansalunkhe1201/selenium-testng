package ExcelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Practice3_GetAllDataInSheet 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("D:\\New folder\\book1.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("sheet3");
		
		int lastrowindex = sh.getLastRowNum();
		for(int i=0; i<=lastrowindex; i++)
		{
			int lastcelindex = sh.getRow(i).getLastCellNum()-1;
			for(int j=0;j<=lastcelindex;j++)
			{
				String value = sh.getRow(i).getCell(j).getStringCellValue();
				System.out.print(value+" ");
			}
			System.out.println();
		}
		
	}

}
