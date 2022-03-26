import java.util.Scanner;
public class FutureDay{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int today,futureDay;
		String days[] = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
		System.out.print("Enter today´s day: ");
		today= input.nextInt();
		System.out.print("Enter the number of days elapsed since today: ");
		futureDay = today + (input.nextInt())%7;
		if (futureDay > 6){
			futureDay = futureDay - 7;
		}
		System.out.println("today is " + days[today] + " and the future day is " + days[futureDay]);
	}
}