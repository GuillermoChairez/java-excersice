import java.util.Scanner;

public class NumberOfYears{
	public static void main(String[] args) {
		int minutes;
		int years;
		int days;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of minutes: ");
		minutes = input.nextInt();
		years = minutes / (60*24*365);
		days = (minutes%(60*24*365))/(60*24);
		System.out.print(minutes + " minutes is approximatley  " + years +" and " + days + " days");
	}
}