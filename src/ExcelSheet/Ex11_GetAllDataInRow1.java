package ExcelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ex11_GetAllDataInRow1 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("D:\\New folder\\book1.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("sheet3");
		
		int lastcellindex = sh.getRow(0).getLastCellNum()-1;
		
		for(int i=0; i<=lastcellindex;i++)
		{
			 Cell cellinfo = sh.getRow(0).getCell(i);
			 CellType s1 = cellinfo.getCellType();
			
			if(s1==CellType.STRING)
			{
				String value = cellinfo.getStringCellValue();
				System.out.print(value+" ");
			}
			else if(s1==CellType.NUMERIC)
			{
				double value = cellinfo.getNumericCellValue();
				System.out.print(value+" ");
			}
			else if(s1==CellType.BOOLEAN)
			{
				boolean value = cellinfo.getBooleanCellValue();
				System.out.print(value+" ");
			}
		}
		
	}

}
