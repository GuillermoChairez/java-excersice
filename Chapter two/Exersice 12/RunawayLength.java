import java.util.Scanner;

public class RunawayLength{
	public static void main(String[] args) {
		double v;
		double a;
		double length;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the speed and acceleration: ");
		v = input.nextDouble();
		a = input.nextDouble();
		length = (Math.pow(v,2))/(2*a);
		System.out.print("The minimun RunawayLength for this airplane is  " + length);
	}
}