package DataDriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class BaseProgram {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis  = new FileInputStream("./src/test/resources/Testdata/Employees.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		 Sheet sh = wb.getSheetAt(0);
		 Row ro = sh.getRow(3);
		  Cell ce = ro.getCell(2);
		  String data = ce.getStringCellValue();
		  System.out.println(data);
		 
		
		
	}

}
