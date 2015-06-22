import java.util.Locale;

import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Duration;
import org.joda.time.Period;
import org.joda.time.chrono.GJChronology;


public class Joda {

	public int getCurrentMonth()
	{
		DateTime dt = new DateTime();
		int month = dt.getMonthOfYear();
		return month;
	}

	public int getSpecificYearPlusHours2000()
	{
		DateTime dt = new DateTime();
		DateTime year2000 = dt.withYear(2000);
		DateTime twoHoursLater = dt.plusHours(2);
		return twoHoursLater.getHourOfDay();
	}
	
	
	
	public DateTime getSpecificYearPlusHours(int year, int hours)
	{
		DateTime dt = new DateTime();
		DateTime year2000 = dt.withYear(year);
		DateTime twoHoursLater = dt.plusHours(hours);
		return twoHoursLater.toDateTime();
	}
	
	
	public void getYear()
	{
		DateTime dt = new DateTime();
		  String monthName = dt.monthOfYear().getAsText();
		  String frenchShortName = dt.monthOfYear().getAsShortText(Locale.FRENCH);
		  boolean isLeapYear = dt.year().isLeap();
		  DateTime rounded = dt.dayOfMonth().roundFloorCopy();
		  
		  DateTimeZone zone = DateTimeZone.forID("Asia/Tokyo");
		  Chronology gregorianJuian = GJChronology.getInstance(zone);
		  
		  
		  DateTime dt1 = new DateTime(2005, 3, 26, 12, 0, 0, 0);
		  DateTime plusPeriod = dt1.plus(Period.days(1));
		  DateTime plusDuration = dt1.plus(new Duration(24L*60L*60L*1000L));
	}
	
}
