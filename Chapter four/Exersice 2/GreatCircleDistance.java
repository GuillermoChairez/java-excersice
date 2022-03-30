import java.util.Scanner;
public class GreatCircleDistance{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double x1,y1,x2,y2,d;
		final double pi = Math.PI; 
		final double radius = 6371.01;

		System.out.println("Enter point 1 (latitude and longitude) in degrees: ");
		x1 = input.nextDouble();
		y1 = input.nextDouble();
		System.out.println("Enter point 2 (latitude and longitude) in degrees: ");
		x2 = input.nextDouble();
		y2 = input.nextDouble();

		x1 = Math.toRadians(x1);
		y1 = Math.toRadians(y1);
		x2 = Math.toRadians(x2);
		y2 = Math.toRadians(y2);

		d = radius*Math.acos(Math.sin(x1)*Math.sin(x2) + Math.cos(x1)*Math.cos(x2)*Math.cos(y1-y2));
		System.out.println("The distance between the two points is " + d);
	}
}