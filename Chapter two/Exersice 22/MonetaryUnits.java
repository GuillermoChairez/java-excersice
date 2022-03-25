import java.util.Scanner;
public class MonetaryUnits{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numberInt;
		double numberDouble;
		System.out.println("Enter an amount in cents: ");
		numberInt = input.nextInt();
		numberDouble = numberInt/100 + (numberInt%100)/100.0;
		System.out.println("Your amount is " + numberDouble + " dollars");
	}
}