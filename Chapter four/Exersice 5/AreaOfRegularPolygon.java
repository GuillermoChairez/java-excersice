import java.util.Scanner;
public class AreaOfRegularPolygon{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double r,area,s;
		int n;
		final double pi = Math.PI; 
		System.out.println("Enter the number of sides: ");
		n =  input.nextInt();
		System.out.println("Enter the side: ");
		s = input.nextDouble();
		area = (n*s*s)/(4*Math.tan(pi/n));
		System.out.println("The area of the Polygon is " + area);
	}
}