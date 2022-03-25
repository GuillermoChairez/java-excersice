import java.util.Scanner;

public class Invesment{
	public static void main(String[] args) {
		Double amount, interesRate, years, invesment;
		Scanner input = new Scanner(System.in);
		//System.out.print("Enter the time zone offset to GMT: ");
		System.out.print("Enter invesment amount: ");
		amount = input.nextDouble();
		System.out.print("Enter annula interest rate in percentage: ");
		interesRate = input.nextDouble();
		System.out.print("Enter number of years: ");
		years = input.nextDouble();
		invesment = amount*(Math.pow((1 + interesRate/100),years));
		System.out.print("Future value is  " + invesment);
	}
}
