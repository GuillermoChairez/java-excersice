public class C2FAndF2C{
	public static void main(String[] args) {
		int celcius = 0;
		int fahrenheit2 = 20;
		double celcius2;
		double fahrenheit;
		System.out.println("Celcius 	Fahrenheit | Fahrenheit 	Celcius");
		while(celcius <= 100){
			fahrenheit = celcius*(9.0/5) + 32;
			celcius2 = (fahrenheit2 -32)*(5.0/9);
			System.out.format("%d 		%.3f 		| %d 		%.3f \n",celcius, fahrenheit,fahrenheit2,celcius2);
			celcius+=2;
			fahrenheit2 +=5;
		}
	}
}