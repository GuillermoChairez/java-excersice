import java.util.Scanner;
public class HighestScore{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		int numberStudents = input.nextInt();
		int score[] = new int[numberStudents];
		String name[] = new String[numberStudents];
		
		for (int i = 0; i < numberStudents; i++){
			System.out.print("Enter the name of the student: ");
			name[i] = input.next();
			System.out.print("Enter the score of the student: ");
			score[i] = input.nextInt();
		}

		int highest = 0;
		for (int i = 0; i < numberStudents; i++){			
			
			if(score[highest] < score[i]){
				highest = i;
			}
		}

		System.out.println("The Highest Score is " + score[highest] + " from " + name[highest]);

	}
}