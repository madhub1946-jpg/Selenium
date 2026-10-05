package DataDriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class ReadDatafromproperty {
	public static void main(String[] args) throws IOException {
		FileInputStream  fis  = new FileInputStream("./src/test/resources/Testdata/commandata.properties");
		Properties p1 = new Properties();
		p1.load(fis);
		String data = p1.getProperty("username");
		System.out.println(data);
	}
				
	}
	