import java.util.Scanner;

public class Bmi{
	public static void main(String[] args) {
		double weight;
		double height;
		double bmi;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter weight in pounds: ");
		weight = input.nextDouble();
		System.out.print("Enter height in inches: ");
		height = input.nextDouble();
		bmi = (weight*0.45359237)/(Math.pow(height*0.0254,2));
		System.out.print("The bmi is  " + bmi);
	}
}