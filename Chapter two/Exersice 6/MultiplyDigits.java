import java.util.Scanner;
public class MultiplyDigits{
	public static void main(String[] args) {
		int number;
		int digits[];
		digits = new int[3];
		int result = 1;
		boolean zero = false;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number between 0 and 1000: ");
		number = input.nextInt();
		int numberCopy = number;
		for(int i = 2; i >= 0 ;i--){
			digits[i] = number/((int)Math.pow(10,i)); 
			number = number - digits[i]*((int)Math.pow(10,i));
			if (digits[i] == 0 && zero == false){

			}
			else{
				result = result*digits[i];
				zero = true;
			} 
		}	
		System.out.println("The multiplication of all digits in  " + numberCopy + " is " + result);
	}
}