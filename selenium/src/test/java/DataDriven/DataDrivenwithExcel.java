package DataDriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataDrivenwithExcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis  = new  FileInputStream("./src/test/resources/Testdata/Employees.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Customer Details");
		Row ro = sh.getRow(2);
		Cell ce = ro.getCell(1);
		String name = ce.getStringCellValue();
		System.out.println(name);
		
	}

}
