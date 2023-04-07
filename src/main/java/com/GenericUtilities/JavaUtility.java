package com.GenericUtilities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

 
public class JavaUtility {
	/**
	 * 
	 * @return
	 * @author Dell
	 */
public int random()
{
	Random ran = new Random();
	int random = ran.nextInt(1000);
	return random;
}
/**
 * 
 * @return
 * @author Dell
 */
public String getSystemDate()
{
	Date dt = new Date();
	String date = dt.toString();
	return date;
}
/**
 * 
 * @return
 * @author Dell
 */
public String formateSystemDate() {
	SimpleDateFormat dateformate = new SimpleDateFormat("dd-mm-yyyy hh:mm:ss");
	Date dt=new Date();
	String getDateAndTime = dateformate.format(dt);
	getDateAndTime.replace(":", "-");
	return getDateAndTime;
}
}
