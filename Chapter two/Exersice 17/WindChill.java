import java.util.Scanner;

public class WindChill{
	public static void main(String[] args) {
		double wind_chill;
		double temp;
		double speed;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the temperature in Farenheit between -58 °F and 41 °F: ");
		temp = input.nextDouble();
		System.out.print("Enter the wind speed (>= 2) in miles per hour: ");
		speed = input.nextDouble();
		wind_chill = 35.74 + 0.6215*temp - 35.75*(Math.pow(speed,0.16)) + 0.4275*(Math.pow(speed,0.16))*temp;
		System.out.print("The wind cill index is:  " + wind_chill);
	}
}