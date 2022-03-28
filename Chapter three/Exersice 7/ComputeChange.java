import java.util.Scanner;

public class ComputeChange {
	public static void main(String[] args) {
	// Create a Scanner
	Scanner input = new Scanner(System.in);
	String plural[] = {"s"," "};
	// Receive the amount
	System.out.print(
	"Enter an amount in double, for example 11.56: ");
	double amount = input.nextDouble();

	int remainingAmount = (int)(amount * 100);

	// Find the number of one dollars
	int numberOfOneDollars = remainingAmount / 100;
	remainingAmount = remainingAmount % 100;

	// Find the number of quarters in the remaining amount
	int numberOfQuarters = remainingAmount / 25;
	remainingAmount = remainingAmount % 25;

	// Find the number of dimes in the remaining amount
	int numberOfDimes = remainingAmount / 10;
	remainingAmount = remainingAmount % 10;

	// Find the number of nickels in the remaining amount
	int numberOfNickels = remainingAmount / 5;
	remainingAmount = remainingAmount % 5;

	// Find the number of pennies in the remaining amount
	int numberOfPennies = remainingAmount;

	// Display results
	System.out.println("Your amount " + amount + " consists of");
	System.out.println(" " + numberOfOneDollars + " dollar" + plural[booleanToInt(numberOfOneDollars == 1)]); 
	System.out.println(" " + numberOfQuarters + " quarter" + plural[booleanToInt(numberOfQuarters == 1)]);
	System.out.println(" " + numberOfDimes + " dime" + plural[booleanToInt(numberOfDimes == 1)] );
	System.out.println(" " + numberOfNickels + " nickel" + plural[booleanToInt(numberOfNickels == 1)]);
	System.out.println(" " + numberOfPennies + " pennie" + plural[booleanToInt(numberOfPennies == 1)]);
	}

	 public static int booleanToInt(boolean value) {
        // Convert true to 1 and false to 0.
        return value ? 1 : 0;
    }
} 