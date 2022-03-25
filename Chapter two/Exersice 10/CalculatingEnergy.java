import java.util.Scanner;

public class CalculatingEnergy{
	public static void main(String[] args) {
		double m;
		double final_temp;
		double init_temp;
		double q;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the amount of water in Kilogrmas: ");
		m = input.nextDouble();
		System.out.print("Enter the initial temperature (°C): ");
 		init_temp = input.nextDouble();
		System.out.print("Enter the final temperature (°C): ");
		final_temp = input.nextDouble();
		q= m*(final_temp - init_temp)*4184;
		System.out.print("The energy needed is " + q);
	}
}