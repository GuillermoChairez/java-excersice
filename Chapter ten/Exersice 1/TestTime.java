public class TestTime{
	public static void main(String[] args) {
		Time time = new Time();
		time.setTime(555550000);
		System.out.println("hour: " + time.getHour());
		System.out.println("minutes: " + time.getMinute());
		System.out.println("second:  " + time.getSecond());
		
	}
}