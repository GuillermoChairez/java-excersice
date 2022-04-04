import java.util.Date;
public class UseDateClass{
	public static void main(String[] args) {
		Date d1 = new Date(10000);
		System.out.println(d1.toString()); 
		Date d2 = new Date(100000);
		System.out.println(d2.toString()); 
		Date d3 = new Date(1000000);
		System.out.println(d3.toString()); 
		Date d4 = new Date(10000000);
		System.out.println(d4.toString()); 
		Date d5 = new Date(100000000);
		System.out.println(d5.toString()); 
		Date d6 = new Date(1000000000);
		System.out.println(d6.toString()); 
	}
}