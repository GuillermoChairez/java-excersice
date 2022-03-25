import java.util.Scanner;
import java.time.LocalDateTime;  

public class CurrentTime{
	public static void main(String[] args) {
		int offset;
		LocalDateTime time = LocalDateTime();
		Scanner input = new Scanner(System.in);
		//System.out.print("Enter the time zone offset to GMT: ");
		offeset = input.nextInt();
		System.out.print(time.now());
	}
}