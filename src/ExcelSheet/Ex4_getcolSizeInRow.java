package ExcelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ex4_getcolSizeInRow
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("D:\\New folder\\book1.xlsx");
		short colsize = WorkbookFactory.create(file).getSheet("sheet1").getRow(0).getLastCellNum();
		System.out.println(colsize);
	}

}
