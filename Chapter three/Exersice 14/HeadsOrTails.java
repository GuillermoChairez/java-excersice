import java.util.Scanner;

 public class HeadsOrTails {
	 public static void main(String[] args) {
	 // 1. Generate two random single-digit integers
	 int coin = (int)(Math.random() * 10);
	 coin = coin%2;

	 // 3. Prompt the student to answer "What is number1 – number2?"
	 System.out.print ("Guess whether the flip of the coin result in head (0) or tail (1):  ");
	 Scanner input = new Scanner(System.in);
	 int answer = input.nextInt();

	 // 4. Grade the answer and display the result
	 if (coin == answer){
	 	System.out.println("You are correct!");
		}
	 else {
		 System.out.println("Your answer is wrong.");
	 }
 }
}