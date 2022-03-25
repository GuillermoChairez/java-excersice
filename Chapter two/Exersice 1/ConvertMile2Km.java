import java.util.Scanner;

public class ConvertMile2Km{
	public static void main(String[] args) {
		double mile;
		double kilometer;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter miles: ");
		mile = input.nextDouble();
		kilometer = mile*1.6;
		System.out.print( mile + " miles is " + kilometer +" Kilometers");
	}
}