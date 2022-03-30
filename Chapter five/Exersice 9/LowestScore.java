import java.util.Scanner;
public class LowestScore{
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

		int lowest = 0;
		int second_lowest = 0;
		for (int i = 0; i < numberStudents; i++){			
			if(score[lowest] > score[i]){
				second_lowest = lowest;
				lowest = i;
			}
		}

		System.out.println("The Lowest Score is " + score[lowest] + " from " + name[lowest]);
		System.out.println("The second lowest Score is " + score[second_lowest] + " from " + name[second_lowest]);

	}
}