import java.util.Scanner;

public class CompoundValue{
	public static void main(String[] args) {
		double amount;
		double value = 0;
		String month[] ={"first","second","third","fourth","fifth","sixth"};
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the monthly saving amount: ");
		amount = input.nextDouble();
		for(int i = 0; i < 6;i++){
			value = (amount + value)*(1.003125);
			System.out.println("After the "+ month[i] +" the account value is " + value);
		}
	}
}