import java.util.Scanner;
public class SortThreeNumbers{
	public static void main(String[] args) {
		double num1, num2, num3;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter three numbers separated by space: ");
		num1 = input.nextDouble();
		num2 = input.nextDouble();
		num3 = input.nextDouble();

	 	displaySortedNumbers(num1,num2,num3);

		
	}

	public static void displaySortedNumbers(double num1, double num2, double num3){
		double numbers[] = {num1,num2,num3};
		int length = numbers.length;
		int i = 1;
		while(true){
			if (i <= 0){
					i = 1;
			}

			if (numbers[i-1] > numbers[i]){
				double temporal = numbers[i -1];
				numbers[i-1] = numbers[i];
				numbers[i] = temporal;
				i--;
			}
			else {
				i++;
			}

			if (i == length){
				break;
			}
			
		}

		for(i = 0; i < length; i++){
			System.out.println(numbers[i]);
		}

	}

}