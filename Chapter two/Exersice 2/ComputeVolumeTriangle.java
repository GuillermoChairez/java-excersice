import java.util.Scanner;
public class ComputeVolumeTriangle{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double length;
		double area;
		double volume;
		System.out.print("Enter the length of the sides and height of the Equilateral triangle: ");
		length = input.nextDouble();
		area = (Math.sqrt(3)/4)*(Math.pow(length,2));
		volume = area*length;
		System.out.println("The area is " + area);
		System.out.println("The volume is " + volume);

	}
}