public class Celcius2Farenheit{
	public static void main(String[] args) {
		int celcius = 0;
		double fahrenheit;
		System.out.println("Celcius 	Fahrenheit");
		while(celcius <= 100){
			fahrenheit = celcius*(9.0/5) + 32;
			System.out.format("%d 		%.1f \n",celcius, fahrenheit);
			celcius+=2;
		}
	}
}