import java.util.Scanner;
public class AllClosestPairs{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of points: ");
		int rows = input.nextInt();

		System.out.println("Enter "+ rows +" points: ");

		double[][] points = new double[rows][2];

		for(int a = 0; a < rows; a++){
			points[a][0] = input.nextDouble();
			points[a][1] = input.nextDouble();
		}

		double shortestDistance = distance(points[0][0],points[0][1], points[1][0],points[1][1]);
		double d; 

		for (int i = 0; i < rows; i++){
			for(int j = i + 1; j < rows; j++){
				d = distance(points[i][0],points[i][1],
					points[j][0],points[j][1]);

				if(d < shortestDistance){
					shortestDistance = d;
				}	
			}
		}

		for (int i = 0; i < rows; i++){
			for(int j = i + 1; j < rows; j++){
				d = distance(points[i][0],points[i][1],
					points[j][0],points[j][1]);

				if(d == shortestDistance){
					System.out.println("The closest two points are " +
					"(" + points[i][0] + ", " + points[i][1] + ") and (" +
					points[j][0] + ", " + points[j][1] + ")");
				}	
			}
		}

		System.out.println("Their distance is  " + shortestDistance);
			
	}

	public static double distance( double x1, double y1, double x2, double y2) {
		return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
	}
}