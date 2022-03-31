import java.util.Scanner;
public class SumDigitsInteger{
	public static void main(String[] args) {
		int n; 
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		n = input.nextInt();
		System.out.println("The sum of the digits is: " + sumDigits(n));
		
	}

	public static int sumDigits(long n){
		int sum = 0; 
		while(true){
			sum+= n%10;
			n = n/10;
			if (n == 0){
				break;
			}
		}
		return sum;
	}
}