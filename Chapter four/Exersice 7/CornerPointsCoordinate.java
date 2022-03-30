import java.util.Scanner;
import java.text.DecimalFormat;
public class CornerPointsCoordinate{
	public static void main(String[] args) {
		final double zeroClock = Math.PI/2; 
		final double angle = (Math.PI*2)/5;
		DecimalFormat df = new DecimalFormat("0.00");
		Scanner input = new Scanner(System.in);
		double radius;
		double points[][] = new double[5][2];
		System.out.println("Enter the radius of the bounding circle: ");
		radius =  input.nextInt();
		System.out.println("The coordinates of five points on the pentagon are ");
		
		for (int i = 0; i < 5; i++){
			points[i][0] = radius*Math.cos(zeroClock + i*angle);
			points[i][1] = radius*Math.sin(zeroClock + i*angle);		
		}

		for (int i = 0; i < 5; i++){
			System.out.println("(" + df.format(points[i][0]) + "," + df.format(points[i][1]) + ")");
		}
		
	}
}