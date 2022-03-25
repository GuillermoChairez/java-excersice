import java.util.Scanner;

public class Interest{
	public static void main(String[] args) {
		Double rate,balance, interest;
		Scanner input = new Scanner(System.in);
		//System.out.print("Enter the time zone offset to GMT: ");
		System.out.print("Enter balance and interest rate (e.g., 3 for 3%):");
		balance = input.nextDouble();
		rate = input.nextDouble();

		interest = balance *(rate/1200);
		System.out.print("The interest is " + interest);
	}
}
