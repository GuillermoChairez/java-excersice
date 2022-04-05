import java.util.Date;
public class Account{
	private int id;
	private double balanced;
	static private double annualInterestRate;
	private Date dateCreated;

	Account(){
		dateCreated = new Date();
	}

	Account(int id, double balanced){
		this.id = id;
		this.balanced = balanced;
		dateCreated = new Date();
	}

	void setId(int id){
		this.id = id;
	}

	void setBalance(double balance){
		this.balanced = balance;
	}

	void setAnnualInteresRate(double annualInterestRate){
		this.annualInterestRate = annualInterestRate/100;
	}

	int getId(){
		return id;
	}

	double getBalance(){
		return balanced;
	}

	double getAnnualInteresRate(){
		return annualInterestRate;
	}

	double getMonthlyInteres(){
		return balanced*(annualInterestRate/12);
	}

	Date getDateCreated(){
		return dateCreated;
	}

	void deposite(double amount){
		this.balanced += amount;
	}

	void withdraw(double amount){
		this.balanced -= amount;
	}

	double getMonthlyInterestRate(){
		return annualInterestRate/12;
	}
}