import java.util.Scanner;
public class PassOrFail{
	public static void main(String[] args) {
		int score;
		Scanner input = new Scanner(System.in);
		
		while(true){
			System.out.println("Enter you score: ");
			score =  input.nextInt();
			if (score >= 60){
				System.out.println("You pass the exam ");
			}
			else if (score == -1){
				System.out.println("No numbers are entered except 0");
				break;
			}
			else{
				System.out.println("You don't pass the exam ");
			}

		}
		
		
	}
}