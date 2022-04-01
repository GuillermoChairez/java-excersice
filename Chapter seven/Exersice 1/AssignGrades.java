import java.util.Scanner;
public class AssignGrades{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of students: ");
		int numberStudents = input.nextInt();
		int score[] = new int[numberStudents];
		char grade[] = new char[numberStudents];

		
		System.out.print("Enter the score of the student: ");

		for (int i = 0; i < numberStudents; i++){
			score[i] = input.nextInt();
		}

		int highest = 0;

		for (int i = 0; i < numberStudents; i++){				
			if(score[highest] < score[i]){
				highest = i;
			}
		}

		for (int k = 0; k < numberStudents; k ++){
			if (score[k] >= (score[highest] - 5)){
				grade[k] = 'A';
			}
			else if (score[k] >= (score[highest] - 10)){
				grade[k] = 'B';
			}
			else if (score[k] >= (score[highest] - 15)){
				grade[k] = 'C';
			}
			else if (score[k] >= (score[highest] - 20)){
				grade[k] = 'D';
			}
			else{
				grade[k] = 'F';
			}

		}

		for (int k = 0; k < numberStudents; k++){
			System.out.println("Student " + k + " is " + score[k] + " and grade is " + grade[k]);
		}
	}
}