import java.util.Scanner;
public class CostOfShipping{
	public static void main(String[] args){
		double w;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the weight of the package ");
		w = input.nextDouble();
		if (w > 0 && w <= 2){
			System.out.println("The shipping cost is 2.5");
		}
		else if (w > 2 && w <= 4){
			System.out.println("The shipping cost is 4.5");
		}
		else if (w > 4 && w <= 10){
			System.out.println("The shipping cost is 7.5");
		}
		else if (w > 10 && w <= 20){
			System.out.println("The shipping cost is 10.5");
		}
		else {
			System.out.println("The package cannot be shipped");
		}
	}
}