/**
 * 
 */
package datetimeprac;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.MonthDay;
import java.time.OffsetTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ValueRange;  
/**
 * @author padmeshbhalla
 *
 */
public class datetimeprac {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  LocalDate date = LocalDate.now();  
		    LocalDate yesterday = date.minusDays(1);  
		    LocalDate tomorrow = yesterday.plusDays(2);  
		    System.out.println("Today date: "+date);  
		    System.out.println("Yesterday date: "+yesterday);  
		    System.out.println("Tommorow date: "+tomorrow);  
		    
		    LocalDate date1 = LocalDate.of(2017, 1, 13);  
		    System.out.println(date1.isLeapYear());  
		    LocalDate date2 = LocalDate.of(2016, 9, 23);  
		    System.out.println(date2.isLeapYear());  
		    
		     
		    LocalDateTime datetime = date.atTime(1,50,9);      
		    System.out.println(datetime);   
		    
		    LocalTime time = LocalTime.now();  
		    System.out.println(time);  
		    LocalTime time1 = LocalTime.of(10,43,12);  
		    System.out.println(time1);  
		    
		    LocalTime time2=time1.minusHours(2);  
		    LocalTime time3=time2.minusMinutes(34);  
		    System.out.println(time3);  

		    MonthDay month = MonthDay.now();  
		    boolean b = month.isValidYear(2012);  
		    System.out.println(b); 
		  
		    long n = month.get(ChronoField.MONTH_OF_YEAR);  
		    System.out.println(n);  

		
		    ValueRange r1 = month.range(ChronoField.MONTH_OF_YEAR);  
		    System.out.println(r1);  
		    ValueRange r2 = month.range(ChronoField.DAY_OF_MONTH);  
		    System.out.println(r2);  
		    
		    OffsetTime offset = OffsetTime.now();  
		    int h = offset.get(ChronoField.HOUR_OF_DAY);  
		    System.out.println(h);  
		    int m = offset.get(ChronoField.MINUTE_OF_DAY);  
		    System.out.println(m);  
		    int s = offset.get(ChronoField.SECOND_OF_DAY);  
		    System.out.println(s);  
	}

}
