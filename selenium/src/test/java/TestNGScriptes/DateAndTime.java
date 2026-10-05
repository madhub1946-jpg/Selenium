package TestNGScriptes;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateAndTime {
	public static void main(String[] args) {
	  Calendar c = Calendar.getInstance();
	  Date d = c.getTime();
	  System.out.println(d);
	  SimpleDateFormat sdf = new SimpleDateFormat("hh-MM-ss dd-mm-yyyy");
	   String td = sdf.format(d);
	   System.out.println(td);
	 
	
	  }
	  public String dTime() {
		  Calendar c = Calendar.getInstance();
		  Date d = c.getTime();
		  SimpleDateFormat sdf = new SimpleDateFormat("hh-mm-ss dd-MM-yyyy");
		   String result = sdf.format(d);
		   return result;
		  
		  
	  }
	

}
