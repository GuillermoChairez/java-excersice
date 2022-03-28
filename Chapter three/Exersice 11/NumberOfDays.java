import java.util.Scanner;
import java.time.Month;
public class NumberOfDays{
	public static void main(String[] args) {
		int mes;
		int year;
		boolean leapYear;
		Scanner input = new Scanner(System.in); 
		System.out.print("Enter the number of the month: ");
		mes = input.nextInt();
		Month month = Month.of(mes);
		System.out.print("Enter the year: ");
		year = input.nextInt();

		if(year%4 == 0){
			leapYear = true;
		}
		else {
			leapYear = false;
		}
		System.out.print(month + " " + year + " has " + month.length(leapYear));
	}
}