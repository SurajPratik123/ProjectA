package practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parametrization {
	public static String excelSheet(String name,int row, int cell) throws EncryptedDocumentException, IOException {
		FileInputStream files =new FileInputStream("D:\\ExcelPractice\\Book1.xlsx");
		String values =WorkbookFactory.create(files).getSheet(name).getRow(row).getCell(cell).getStringCellValue();
		return values;
		
	}
	

}
