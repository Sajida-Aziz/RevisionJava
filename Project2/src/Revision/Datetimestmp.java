package Revision;


import java.io.File;
import java.sql.Timestamp;
import java.util.Date;
public class Datetimestmp {

	public static void main(String[] args) {
		
		Date date = new Date();
		Timestamp ts=new Timestamp(date.getTime());
		System.out.println(ts);
		
		String FileName = ts.toString().replace(":", "_").replace(" ", "_") + ".png";
		System.out.println(FileName);
		}
		// TODO Auto-generated method stub

	}


