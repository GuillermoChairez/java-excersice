import java.util.Scanner;
public class EstimateAreas{

	private static final double pi = Math.PI; 
	private static final double radius = 6371.01;

	public static double distance(double x1, double y1, double x2, double y2){
		double d;
		d = radius*Math.acos(Math.sin(x1)*Math.sin(x2) + Math.cos(x1)*Math.cos(x2)*Math.cos(y1-y2));
		return d;
	}

	public static double AreaTriangle(double d1, double d2, double d3, double s){
		double area;
		area = Math.sqrt(s*(s-d1)*(s-d2)*(s-d3));
		return area;
	}



	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double x1,y1,x2,y2,x3,y3,x4,y4;
		double d1,d2,d3,d4,d5;
		double s1, s2;
		double areaTotal, area1, area2;

		System.out.println("Enter point 1 (latitude and longitude) in degrees: ");
		x1 = input.nextDouble();
		y1 = input.nextDouble();
		System.out.println("Enter point 2 (latitude and longitude) in degrees: ");
		x2 = input.nextDouble();
		y2 = input.nextDouble();
		System.out.println("Enter point 3 (latitude and longitude) in degrees: ");
		x3 = input.nextDouble();
		y3 = input.nextDouble();
		System.out.println("Enter point 4 (latitude and longitude) in degrees: ");
		x4 = input.nextDouble();
		y4 = input.nextDouble();


		x1 = Math.toRadians(x1);
		y1 = Math.toRadians(y1);
		x2 = Math.toRadians(x2);
		y2 = Math.toRadians(y2);
		x3 = Math.toRadians(x3);
		y3 = Math.toRadians(y3);
		x4 = Math.toRadians(x4);
		y4 = Math.toRadians(y4);

		d1 = distance(x1,y1,x2,y2);
		d2 = distance(x1,y1,x4,y4);
		d3 = distance(x2,y2,x3,y3);
		d4 = distance(x3,y3,x4,y4);
		d5 = distance(x1,y1,x3,y3);

		s1 = (d1 + d2 + d5)/2;
		s2 = (d3 + d4 + d5)/2;

		area1 = AreaTriangle(d1,d2,d5,s1);
		area2 = AreaTriangle(d3,d4,d5,s2);

		areaTotal = area1 + area2; 
		System.out.println("The area enclosed by these citites is " + areaTotal);
	}
}