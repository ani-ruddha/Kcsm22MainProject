package genericUtility;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
/**
 * this class is use to perform all the java related operations
 * @author Aniruddha
 */
public class JavaUtility {

	/**
	 * This method is a generic method to generate random number
	 * @return
	 */
	public int getRandomNumber()
	{
		Random number = new Random();
	int randomNumber =	number.nextInt(10000);
	return randomNumber;
	}
	
	/**
	 * this method is used to provide the current date
	 * @return
	 */
	public String getDateUsingCalendar()
	{
	Calendar cal =	Calendar.getInstance();
	Date d = cal.getTime();
	SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/YYYY");
	String modifiedDate = sdf.format(d);
	return modifiedDate;
	}
	
}





