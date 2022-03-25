import java.util.Scanner;

public class ConvertMeters2Ping{
	public static void main(String[] args) {
		double meter;
		double ping;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number in square meters: ");
		meter = input.nextDouble();
		ping = meter*0.3025;
		System.out.print(meter + " meters is " + ping+" feets");
	}
}