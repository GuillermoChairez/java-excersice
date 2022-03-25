import java.util.Scanner;

public class Acceleration{
	public static void main(String[] args) {
		double v0;
		double v1;
		double t;
		double acceleration;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter v0, v1, and t: ");
		v0 = input.nextDouble();
		v1 = input.nextDouble();
		t = input.nextDouble();
		acceleration= (v1 - v0)/t;
		System.out.print("The average acceleration is " + acceleration);
	}
}