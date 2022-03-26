public class NumberMonth {
	public static void main(String[] args) {
		int number = (int)(System.currentTimeMillis() % 13);
		String months[] ={"January","February","March","April","May","June",
		"July","August","Septmber","October","November","December"}; 
		System.out.println(months[number - 1] + " is the month number " + number);
	}
}