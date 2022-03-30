import java.util.Scanner;
public class AreaOfHexagon{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double r,area,s;
		final double pi = Math.PI; 
		System.out.println("Enter the side: ");
		s = input.nextDouble();
		area = (6*s*s)/(4*Math.tan(pi/6));
		System.out.println("The area of the Hexagon is " + area);
	}
}