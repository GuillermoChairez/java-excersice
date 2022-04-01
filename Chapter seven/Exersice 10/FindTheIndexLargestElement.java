import java.util.Scanner;
public class FindTheIndexLargestElement{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] numbers = new double[10];

		System.out.println("Enter ten numbers: ");
		
		for(int i = 0; i < 10; i ++){
			numbers[i] = input.nextDouble();
		}
		int index =indexOfLargestElement(numbers);
		System.out.println("The index of the largest element is: " + index);
		System.out.println("And the number is : " + numbers[index]);

	}
	public static int indexOfLargestElement(double[] array){
		double largest = 0;
		int index = 0;

		for (int i = 0; i < array.length; i++){
			if (array[i] >= largest){
				largest = array[i];
				index = i;
			}
		}
		return index;
	}
}