package TestNGScriptes;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import comm.Actitime.GenericLibrary.Facebook;

public class ConneDate{
	
	public String Cannvo() {
		Calendar c = Calendar.getInstance();
		Date d = c.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat();
		String result = sdf.format(d);
		return result;
	}

}
