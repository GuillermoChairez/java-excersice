import java.util.Scanner;

public class ThreeInts{
	public static void main(String[] args) {
		int value;
		int[] digits = new int[3];
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a integer of three digits: ");
		value = input.nextInt();
		
		for(int i = digits.length - 1; i >= 0 ; i--){
			int pow = (int) Math.pow(10,i);
			digits[i] = value / pow;
			value = value - digits[i]*pow;
		}

		int index = 1;
		while(true){
			if (digits[index - 1] > digits[index]){
				int temporal = digits[index -1];
				digits[index - 1] = digits[index];
				digits[index] = temporal;
				index--;
			}
			index++;
			if(index == digits.length){
				break;
			}
		}

		for(int i = 0; i < digits.length ; i++){
			System.out.println(digits[i]);
		}
	}
}