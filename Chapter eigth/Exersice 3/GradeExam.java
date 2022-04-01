public class GradeExam{
/** Main method */
	public static void main(String[] args) {
	// Students' answers to the questions
		char[][] answers = {
		{'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
		{'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
		{'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
		{'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
		{'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
		{'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
		{'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
		{'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};

		// Key to the questions
		char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

		int [][] grades = new int[answers.length][2];
		// Grade all answers
		for (int i = 0; i < answers.length; i++) {
		// Grade one student
		int correctCount = 0;

			for (int j = 0; j < answers[i].length; j++) {
				if (answers[i][j] == keys[j])
				correctCount++;
			}

			grades[i][0] = i;
			grades[i][1] = correctCount; 
		}

		for(int j = 0; j < grades.length; j++){
			for(int k = 0; k < grades.length - 1; k++){
				if(grades[k][1] < grades[k + 1][1]){
					int temporal = grades[k][1];
					int temporal2 = grades[k][0];

					grades[k][0] = grades[k+1][0];
					grades[k][1] = grades[k+1][1];

					grades[k+1][0] = temporal2;
					grades[k+1][1] = temporal;
				}

			}
		}

		for(int i = 0; i < grades.length; i++){
			System.out.println("Student " + grades[i][0] + "'s correct count is " +
				grades[i][1]);
		}
	}
}