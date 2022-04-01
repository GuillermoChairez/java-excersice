import java.util.Scanner;
public class AddTwoMatrices{
	public static void main(String[] args) {
		final int row = 2;
		final int column = 2;
		double[][] a = new double[row][column];
		double[][] b = new double[row][column];

		Scanner input = new Scanner(System.in);

		System.out.println("Enter matrix1 2 by 2 row by row");

		for(int i = 0; i < row; i++){
			for(int j = 0; j < column; j++){
				a[i][j] = input.nextDouble();
			}
		}

		System.out.println("Enter matrix2 2 by 2 row by row");

		for(int i = 0; i < row; i++){
			for(int j = 0; j < column; j++){
				b[i][j] = input.nextDouble();
			}
		}

		double[][] c = addMatrix(a,b);
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

	public static double[][] addMatrix(double[][] a, double[][] b){
		int rows = a.length;
		int columns = a[0].length;
		double [][] c = new double[rows][columns];

		for(int i = 0; i < rows; i++){
			for(int j = 0; j < columns; j++){
				c[i][j] = a[i][j] + b[i][j]; 
			}
		}
		return c;
	}
}
