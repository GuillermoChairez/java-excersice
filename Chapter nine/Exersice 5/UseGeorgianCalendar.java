import java.util.Calendar;
import java.util.GregorianCalendar;
public class UseGeorgianCalendar{
	public static void main(String[] args) {
		GregorianCalendar gcal = new GregorianCalendar();
        System.out.println("Calendar date: " + gcal.getTime());
        gcal.setTimeInMillis(1234567898765L);
        System.out.println("Calendar date: " + gcal.getTime());
		
	}
}