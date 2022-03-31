import java.util.Scanner;
public class FutureInvesmentValue{
	public static void main(String[] args) {
		double amount,interesRate, invesment;
		int years;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter invesment amount: ");
		amount = input.nextDouble();
		System.out.print("Enter annula interest rate in percentage: ");
		interesRate = input.nextDouble();
		System.out.print("Enter number of years: ");
		years = input.nextInt();

		System.out.println("Years 	Future Value");
		for (int i = 1; i <= years; i++){
			invesment = futureInvesmentValue(amount,interesRate,i);
			System.out.format("%d 		%.2f \n",i,invesment);
		}
		
	}

	public static double futureInvesmentValue(double investmentAmount, double monthlyInterestRate,int years){
		double invesment = investmentAmount*(Math.pow((1 + (monthlyInterestRate*12)/100),years));
		return invesment;
	}
}