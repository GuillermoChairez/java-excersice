import java.util.Scanner;

public class ConversionMiles2Kilometer{
	public static void main(String[] args) {
		double kilometers = 20;
		double miles = 1;
		System.out.println("Miles 		Kilometers 		| 	Kilometers 		Miles");
		while(miles <= 10){

			System.out.format("%.0f 		%.3f 				%.0f 			%.3f \n",
			miles,mileToKilometer(miles),kilometers,kilometerToMile(kilometers));

			miles++;
			kilometers += 5;
		} 
	}
	public static double mileToKilometer(double mile){
		double kilometer;
		kilometer = 1.6*mile;
		return kilometer;
	}
	public static double kilometerToMile(double kilometer){
		double mile;
		mile = kilometer/1.6;
		return mile;
	}
}