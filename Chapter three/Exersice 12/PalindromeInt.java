import java.util.Scanner;

public class PalindromeInt{
	public static void main(String[] args) {
		String number;
		boolean palindrome = true; 
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a three digit integer:  ");
		number = input.next();
		int length = number.length();

		for (int i = 0; i < length; i ++){
			if(number.charAt(i) != number.charAt(length - i -1)){
				palindrome = false;
			}
		}

		if(palindrome){
			System.out.println(number + " Is a palindrome");
		}
		else{
			System.out.println(number + " Is not a palindrome");
		}
	}
}