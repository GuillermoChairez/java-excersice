public class TestAccount{
	public static void main(String[] args) {
		Account myaccount = new Account(1122,20000);
		myaccount.setAnnualInteresRate(4.5);
		System.out.println("Initial balance: " + myaccount.getBalance());
		myaccount.withdraw(2500);
		System.out.println("Balance after withdraw: " + myaccount.getBalance());
		myaccount.deposite(3000);
		System.out.println("Balance after deposite: " + myaccount.getBalance());
		System.out.println("The intereset monthly is : " + myaccount.getMonthlyInterestRate());
		System.out.println("The create date is  " + myaccount.getDateCreated());
	}
}