import java.util.Scanner;
public class Crammer{
	public static void main(String[] args){
		double a, b, c, d, e, f, x, y, denominador;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the values a,b,c,d,e,f:");
		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();
		d = input.nextDouble();
		e = input.nextDouble();
		f = input.nextDouble();
		denominador = (a*d - b*c);
		if (denominador == 0){
			System.out.println("The equation has no solution");
		}
		else {
			x = (e*d - b*f)/denominador;
			y = (a*f - e*c)/denominador;
			System.out.println("X = " + x + " Y = " + y);
		}


	}
}