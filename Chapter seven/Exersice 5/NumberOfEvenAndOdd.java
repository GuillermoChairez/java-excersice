import java.util.Scanner;
import java.util.ArrayList;
public class NumberOfEvenAndOdd{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		System.out.println("Enter numbers: ");

		while(input.hasNextInt()){
			int num = input.nextInt();
			if(num == 0){
				break;
			}
			else{
				numbers.add(num);
			}
		}

		final int SIZE = numbers.size();

		int odds = 0;
		int even = 0;

		for(int i = 0; i < SIZE; i++){
			if (numbers.get(i)%2 == 0){
				even++;
			}
			else{
				odds++;
			}
		}

		System.out.println("The number of odds numbers : " + odds);
		System.out.println("The number of even numbers : " + even);
	}
} 