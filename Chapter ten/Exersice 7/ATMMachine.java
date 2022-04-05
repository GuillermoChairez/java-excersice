import java.util.Scanner;
public class ATMMachine{
	public static void main(String[] args) {
		Account[] accounts = new Account[10];

		for(int i = 0; i < 10; i ++){
			accounts[i] = new Account(i,100);
		}

		Scanner input = new Scanner(System.in);
		int id = 0;
		int choice;
		boolean menu;
		double amount;

		while(id != 13){
			System.out.print("Enter an id: ");
			id = input.nextInt();

			if(id >= 0 && id <= 9){
				menu = true;
				while(menu){
					mainMenu();
					choice = input.nextInt();
					switch(choice){
						case 1:
							System.out.println("The balance is " + accounts[id].getBalance());
							break;
						case 2:
							System.out.print("Enter an amount of withdraw: ");
							amount = input.nextDouble();
							accounts[id].withdraw(amount);
							break;
						case 3:
							System.out.print("Enter an amount of deposit: ");
							amount = input.nextDouble();
							accounts[id].deposite(amount);
							break;
						case 4:
							menu = false;
							break;
						default:
							break;

					}

				}
			}
			else {
				System.out.print("Enter a acorrect id: ");
			}


		}
	}

	static void mainMenu(){
		System.out.println("1. check balance");
		System.out.println("2. withdraw");
		System.out.println("3. deposit");
		System.out.println("4. exit");
		System.out.print("Enter a choice: ");
	}
}