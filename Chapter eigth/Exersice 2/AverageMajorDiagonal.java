import java.util.Scanner;
public class AverageMajorDiagonal{
	public static void main(String[] args) {
		final int row = 4;
		final int column = 4;
		double[][] matrix = new double[row][column];
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a 4 by 4 matrix row by row");

		for(int i = 0; i < row; i++){
			for(int j = 0; j < column; j++){
				matrix[i][j] = input.nextDouble();
			}
		}

		System.out.println("Average of the major diagonal is  " +
			averageMajorDiagonal(matrix));
		
	}

	public static double averageMajorDiagonal(double[][] m){
		int row = m.length;
		double sum = 0;
		double average;

		 for (int i = 0; i < row; i++) {
		 	sum += m[i][i];
		 }
		 average = sum/row;
		 return average;
	}
}
