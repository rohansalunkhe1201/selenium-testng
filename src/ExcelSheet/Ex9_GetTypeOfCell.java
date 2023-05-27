package ExcelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ex9_GetTypeOfCell 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("D:\\New folder\\book1.xlsx");
		
		Sheet sh = WorkbookFactory.create(file).getSheet("sheet2");
		
		CellType celltype = sh.getRow(0).getCell(2).getCellType();
		
	     System.out.println(celltype);
		
	}

}
