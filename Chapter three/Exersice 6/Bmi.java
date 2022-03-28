import java.util.Scanner;

public class Bmi{
	public static void main(String[] args) {
		double weight;
		double height;
		int feets;
		int inches;
		double bmi;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter weight in pounds: ");
		weight = input.nextDouble();
		System.out.print("Enter height in feets: ");
		feets = input.nextInt();
		System.out.print("Enter height in inches: ");
		inches = input.nextInt();
		height = inches + 12*feets;
		bmi = (weight*0.45359237)/(Math.pow(height*0.0254,2));
		System.out.println("The bmi is  " + bmi);
		if (bmi < 18.5){
			System.out.println("Underweight");
		}
		else if(bmi <25){
			System.out.println("Normal");
		}
		else if(bmi < 30){
			System.out.println("Overweight");
		}
		else {
			System.out.println("Obese");
		}
	}
}