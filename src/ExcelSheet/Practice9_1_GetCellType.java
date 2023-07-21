package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Practice9_1_GetCellType 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
        FileInputStream file=new FileInputStream("D:\\New folder\\book1.xlsx");
		
		Sheet sh = WorkbookFactory.create(file).getSheet("sheet4");
		
		CellType celltype = sh.getRow(0).getCell(0).getCellType();
		System.out.println(celltype);
		
	}

}
