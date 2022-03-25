import java.util.Scanner;

public class AreaHexagon{
	public static void main(String[] args) {
		double lenght;
		double area;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the lenght of the side: ");
		lenght = input.nextDouble();
		area = (Math.pow(3,1.5)/2)*(Math.pow(lenght,2));
		System.out.print("The Area of the Hexagon is:  " + area);
	}
}