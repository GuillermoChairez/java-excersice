import java.util.Scanner;
public class PalindromeInteger{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter an integer: ");
		int number = input.nextInt();
		System.out.println(reverse(number));

		if(isPalindrome(number)){
			System.out.println(number + " Is a palindrome");
		}
		else {
			System.out.println(number + " Is not a palindrome");
		}
		
	}

	public static int reverse(int number){
		int new_number = 0; 
		int digits = 0;
		while(true){
			if ((number/((int)Math.pow(10,digits))) == 0){
				break;
			}
			digits++;
		}

		while(true){
			new_number += (number%10)*((int)Math.pow(10,digits -1));
			number = number/10;
			digits--;
			if (number == 0){
				break;
			}
		}

		return new_number;
	}

	public static boolean isPalindrome(int number){
		if (number == reverse(number)){
			return true;
		}
		else {
			return false;
		}
	}
}