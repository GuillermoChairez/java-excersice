import java.util.Scanner;
public class MultiplyTwoMatrices{
	public static void main(String[] args) {
		final int row = 3;
		final int column = 3;
		double[][] a = new double[row][column];
		double[][] b = new double[row][column];

		Scanner input = new Scanner(System.in);

		System.out.println("Enter matrix1 3 by 3 : ");

		for(int i = 0; i < row; i++){
			for(int j = 0; j < column; j++){
				a[i][j] = input.nextDouble();
			}
		}

		System.out.println("Enter matrix2 3 by 3 : ");

		for(int i = 0; i < row; i++){
			for(int j = 0; j < column; j++){
				b[i][j] = input.nextDouble();
			}
		}

		double[][] c = multiplyMatrix(a,b);
		double[][] matrix = new double[row][column];

		for(int i = 0; i < row; i++){
			for(int j = 0; j < 3; j++){
				switch(j){
					case 0:
					 	matrix = a;
						break;
					case 1:
						matrix = b;
						break;
					case 2:
						matrix = c;
						break;
				}
				for(int k = 0; k < column; k++){
					System.out.print( matrix[i][k] + " ");
				}
				System.out.print("	 ");
			}
			System.out.println("");

		}
		
	}

	public static double[][] multiplyMatrix(double[][] a, double[][] b){
		int rows = a.length;
		int columns = a[0].length;
		double sum = 0;
		double [][] c = new double[rows][columns];

		for(int i = 0; i < columns; i++){
			for (int j = 0; j < rows; j++){
				sum = 0;
				for(int k = 0; k < columns; k++){
					sum += a[j][k]*b[k][i]; 
				}
				c[j][i] = sum;
			}
		}
		return c;
	}
}
