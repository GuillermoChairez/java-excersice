import java.util.Scanner;
public class FindTheLargestELement{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] numbers = new double[10];

		System.out.println("Enter ten numbers: ");
		
		for(int i = 0; i < 10; i ++){
			numbers[i] = input.nextDouble();
		}
		System.out.println("The largest element is: " + max(numbers));
	}
	public static double max(double[] array){
		double largest = 0;

		for (int i = 0; i < array.length; i++){
			if (array[i] > largest){
				largest = array[i];
			}
		}
		return largest;
	}
}