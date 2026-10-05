package DataDriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class BaseMthodEntairRow {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/Testdata/Employees.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		 short count = wb.getSheet("Customer Details").getRow(2).getLastCellNum();
		 for (int i = 0; i < count; i++) {
			 String data = wb.getSheet("Customer Details").getRow(2).getCell(i+1).getStringCellValue();
			 System.out.println(data);
			
		}
	}

}
