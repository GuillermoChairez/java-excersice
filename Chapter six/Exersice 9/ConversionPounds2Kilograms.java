public class ConversionPounds2Kilograms{
	public static void main(String[] args) {
		double  kilograms = 1;
		double pounds = 20;
		System.out.println("Kilograms		Pounds 		| 	Pounds 		Kilograms");
		while(kilograms <= 199){

			System.out.format("%3.0f 		%3.3f 				%3.0f 			%3.3f \n",
			kilograms,kilogramToPound(kilograms),pounds,poundToKilogram(pounds));

			kilograms += 3;
			pounds += 5;
		} 
	}
	public static double poundToKilogram(double pound){
		double kilogram;
		kilogram = 0.453*pound;
		return kilogram;
	}
	public static double kilogramToPound(double kilogram){
		double pound;
		pound = 2.204*kilogram;
		return pound;
	}
}