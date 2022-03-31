import java.util.Scanner;
public class DisplayPatterns{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the n term: ");
		int n = input.nextInt();
		displayPattern(n);
		
	}

	public static void displayPattern(int n){
   		for(int i = 1;  i <= n; i++){
   			for(int j = 1; j <= i; j++){
				System.out.print(j + " ");
			}
			System.out.println("");
   		}
   		for(int j = n; j >= 1; j--){
				System.out.print(j + " ");
		}
	}
}