import java.util.Scanner;
public class SumElementsRowByRow{
	public static void main(String[] args) {
		double[][] matrix = new double[3][4];
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a 3 by 4 matrix row by row");

		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 4; j++){
				matrix[i][j] = input.nextDouble();
			}
		}

		for(int k = 0; k < 3; k++){
			System.out.println("Sum of the elements at row " + k + 
			" is " + sumRow(matrix,k));
		}
		
	}

	public static double sumRow(double[][] m, int rowIndex){
		int length = m[rowIndex].length;
		double sum = 0;

		 for (int i = 0; i < length; i++) {
		 	sum += m[rowIndex][i];
		 }

		 return sum;
	}

}