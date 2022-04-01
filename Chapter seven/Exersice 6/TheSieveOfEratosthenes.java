import java.util.Scanner;
public class TheSieveOfEratosthenes{
	public static void main(String[] args) {
		int n;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the n number: ");
		n = input.nextInt();
		boolean[] flag = new boolean[n+1];

		for(int i = 0; i <= n; i++){
			flag[i] = true;
		}

		for(int i = 2; i <= n; i++){
			if (flag[i] == false){
				
			}
			else {
				System.out.println(i);
				for(int j = i + 1; j <= n; j++){
					if(j%i ==0){
						flag[j] = false;
					}
				}
			}
		}
	}
}