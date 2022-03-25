import java.util.Scanner;

public class ConvertMeters2Feet{
	public static void main(String[] args) {
		double meter;
		double feet;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a value for meters: ");
		meter = input.nextDouble();
		feet = meter*3.2786;
		System.out.print(meter + " meters is " + feet+" feets");
	}
}