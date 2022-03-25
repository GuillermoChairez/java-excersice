import java.util.Scanner;
public class PopulationProjection{
	public static void main(String[] args) {
		int population = 312032486;
		int year;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of years: ");
		year = input.nextInt();
		population = population + (60*60*24*365*year)/7;
		population = population - (60*60*24*365*year)/13;
		population = population + (60*60*24*365*year)/45;
		System.out.println("The population in "+ year + " is " + population);
	}
}