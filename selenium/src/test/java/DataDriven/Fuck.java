package DataDriven;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Fuck {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/Testdata/Employees.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet("Customer Details").getRow(2).getCell(3).setCellValue("Active");
		FileOutputStream fos = new FileOutputStream("./src/test/resources/Testdata/Employees.xlsx");
		wb.write(fos);
		wb.close();
	}
}
