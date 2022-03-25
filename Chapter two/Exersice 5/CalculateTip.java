import java.util.Scanner;

public class CalculateTip{
	public static void main(String[] args) {
		double subtotal;
		double total;
		double gratuity_rate;
		double gratuity;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the subtotal and gratuity rate: ");
		subtotal = input.nextDouble();
		gratuity_rate = input.nextDouble();
		gratuity = subtotal*(gratuity_rate/100);
		total = subtotal + gratuity;
		System.out.print("The gratuity is " + gratuity +" and the total is " + total);
	}
}