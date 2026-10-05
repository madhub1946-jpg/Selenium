package DataDriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Method {
	public String ReadDatafromProperpty(String key) throws IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/Testdata/commandata.properties");
		Properties p = new Properties();
		p.load(fis);
		String data = p.getProperty(key);
		return data;		
	}
	public static void main(String[] args) throws IOException {
		Method m = new  Method();
		String data = m.ReadDatafromProperpty("url");
		String data1 = m.ReadDatafromProperpty("username");
		String data2 = m.ReadDatafromProperpty("password");
		
		System.out.println(data);
		System.out.println(data1);
		System.out.println(data2);
	}

}
