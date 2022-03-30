import java.util.Scanner;
public class ASCIICharacter{
	public static void main(String[] args) {
		char character;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a character: ");
		character =  input.next().charAt(0);
		int value = character;
		System.out.println("The ASCII code for character "+ character + " is " + value);
		
	}
}