import java.util.Scanner;
public class ComparingNumbers{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int integers[] = new int[11];

		System.out.println("Enter 11 integers: ");

		for (int i = 0; i < 11; i++){
			integers[i] = input.nextInt();
		}

		for (int i = 0; i < 11; i++){
			if (integers[i] < integers[10]){
				System.out.println(integers[i] + " is smaller than " + integers[10]);
			}
			else if (integers[i] > integers[10]){
				System.out.println(integers[i] + " is grater than " + integers[10]);
			}
			else if (integers[i] == integers[10]){
				System.out.println(integers[i] + " is equals to " + integers[10]);
			}

		}
		
	}
}