public class largestRowAndColumn{
	public static void main(String[] args) {
		int[][] matrix = new int[5][5];
		final int row = matrix.length;
		final int column = matrix[0].length;
		int largest_column = 0;
		int largest_row = 0;

		for(int i = 0; i < row; i++){
			for(int j = 0; j < column; j++){
				matrix[i][j] = (int)(Math.random()*18 % 2);
			}
		}

		int ones_row = 0;
		int ones_column = 0;
		int last_row = 0;
		int last_column = 0;

		for(int i = 0; i < row; i++){

			ones_row = 0;
			ones_column = 0;
			for(int j = 0; j < column; j++){	
				if(matrix[i][j] == 1){
					ones_row++;
				}

				if(matrix[j][i] == 1){
					ones_column++;
				}
			}

			if(ones_row > last_row){
				last_row = ones_row;
				largest_row = i;
			}

			if(ones_column > last_column){
				last_column = ones_column;
				largest_column = i;
			}
		}

		for(int i = 0; i < row; i++){
			for(int j = 0; j < column; j++){
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println("");
		}

		
		System.out.println("The largset row index: " + largest_row);
		System.out.println("The largset column index: " + largest_column);
	}
}