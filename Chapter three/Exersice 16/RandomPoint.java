import java.util.Scanner;

public class RandomPoint{
	public static void main(String[] args) {
		// Generate a lottery number
		int width = 50;
		int height = 150;
		double x = (Math.random()*(2*width) - width);
		double y = (Math.random()*(2*height) - height);

		System.out.println(" The coordinate is (" + x + "," + y + ")");
	}
}