import java.util.Scanner;

public class ScissorRockPaper{
	public static void main(String[] args) {
		int machine = (int) (Math.random()*(2));
		String options[] = {"Scissor", "Rock", "Paper"};
		Scanner input = new Scanner(System.in);

		System.out.println("Scissor (0) rock (1) paper(2): ");
		int myOption = input.nextInt();

		int difference = (myOption - machine);

		if (difference == 0){
			System.out.println("The computer is " + options[machine] 
				+ ". You are " + options[myOption] + " It is a draw");
		}
		else if (difference == 1 || difference == -2){
			System.out.println("The computer is " + options[machine] 
				+ ". You are " + options[myOption] + " you won");
		}
		else {
			System.out.println("The computer is " + options[machine] 
				+ ". You are " + options[myOption] + " You loose");
		}
	}
}