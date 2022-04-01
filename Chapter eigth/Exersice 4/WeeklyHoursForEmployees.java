public class WeeklyHoursForEmployees{
	public static void main(String[] args) {
		int[][] employeesHours = new int[7][7];
		int rows = employeesHours.length;
		int columns = employeesHours[0].length;

		for(int i = 0; i < rows; i ++){
			for(int j = 0; j < columns; j++){
				employeesHours[i][j] = (int) (Math.random()*(9-1) + 1);
			}
		}

		int[][] totalHours = new int [rows][2];

		for(int j = 0; j < rows; j++){
			totalHours[j][0] = j;
			totalHours[j][1] = 0;
			for (int k = 0; k < columns; k++){
				totalHours[j][1] += employeesHours[j][k];
			}
		}

		increasing(totalHours);

		System.out.println("           Su  M  T  W  Th  F  Sa  Total hours");

		for(int j = 0; j < rows; j++){
			int order = totalHours[j][0];
			System.out.print("Employee " + order);

			for (int k = 0; k < columns; k++){
				System.out.print("  " + employeesHours[order][k] + " ");
			}
			System.out.print("  " + totalHours[j][1]);
			System.out.println("");
		}
	}

	public static void increasing(int[][] matrix){
		int rows = matrix.length;
		int columns = matrix[0].length;

		for(int j = 0; j < rows; j++){
			for(int k = 0; k < rows - 1; k++){
				if(matrix[k][1] > matrix[k + 1][1]){
					int temporal = matrix[k][1];
					int temporal2 = matrix[k][0];

					matrix[k][0] = matrix[k+1][0];
					matrix[k][1] = matrix[k+1][1];

					matrix[k+1][0] = temporal2;
					matrix[k+1][1] = temporal;
				}
			}
		}
	}
}