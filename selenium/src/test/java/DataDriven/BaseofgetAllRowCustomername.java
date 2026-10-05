package DataDriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class BaseofgetAllRowCustomername {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis  = new FileInputStream("./src/test/resources/Testdata/Employees.xlsx");
	 Workbook wb = WorkbookFactory.create(fis);
	 int count = wb.getSheet("Customer Details").getLastRowNum();
	 for (int i = 0; i < count; i++) {
		 String data = wb.getSheet("Customer Details").getRow(i+1).getCell(1).getStringCellValue();
		 System.out.println(data);	
	}
		}
		
	}


