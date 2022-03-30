import java.util.Scanner;
public class GeometryArea{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double r,area,s;
		final double pi = Math.PI; 
		System.out.println("Enter the length from the center to a vertex: ");
		r = input.nextDouble();
		s = 2*r*Math.sin(pi/5);
		area = (5*s*s)/(4*Math.tan(pi/5));
		System.out.println("The area of the pentagon is " + area);
	}
}