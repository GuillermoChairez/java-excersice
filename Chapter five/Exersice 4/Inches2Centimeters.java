public class Inches2Centimeters{
	public static void main(String[] args) {
		int inches = 1;
		double centimiters;
		System.out.println("Inches 	Centimetres");
		while(inches <= 10){
			centimiters = 2.54*inches;
			System.out.format("%d 		%.2f \n",inches, centimiters);
			inches++;
		}
	}
}