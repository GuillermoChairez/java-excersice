import java.util.Scanner;
public class CostOfDriving{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double distance, milesPerGalon, pricePerGalon, cost;
		System.out.print("Enter the driving distance: ");
		distance = input.nextDouble();
		System.out.print("Enter the miles per gallon: ");
		milesPerGalon = input.nextDouble();
		System.out.print("Enter the price per gallon: ");
		pricePerGalon = input.nextDouble();
		cost = (distance/milesPerGalon)*pricePerGalon;
		System.out.println("The cost of the Driving is " + cost + " dollars");
	}
}