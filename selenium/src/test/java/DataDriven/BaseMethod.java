package DataDriven;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class BaseMethod {
	
	public String ReadDatafromProperpty(String key) throws IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/Testdata/commandata.properties");
		Properties p = new Properties();
		p.load(fis);
		String data = p.getProperty(key);
		return data;		
	}
	public String readDatafromExcel(String sheetname, int row, int cell ) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/Testdata/Employees.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		 String data = wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
		 return data;
	}
	
	public double readDataforExcelNumericvalue(String sheetname, int row, int cell) throws EncryptedDocumentException, IOException {
		FileInputStream fis  = new FileInputStream("./src/test/resources/Testdata/Employees.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		double data = wb.getSheet(sheetname).getRow(row).getCell(cell).getNumericCellValue();
		return data;
		
	}
	public void UpdateOfExcelFile(String sheet,int row,int cell,String value ) throws EncryptedDocumentException, IOException{
		FileInputStream fis  = new FileInputStream("./src/test/resources/Testdata/Employees.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	wb.getSheet(sheet).getRow(row).getCell(cell).setCellValue(value);
	FileOutputStream fos  = new FileOutputStream("./src/test/resources/Testdata/Employees.xlsx");
	wb.write(fos);
	wb.close();
	
		
	}
}
