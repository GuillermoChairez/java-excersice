import java.util.Scanner;
import java.util.ArrayList;
public class CountOcurrence{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		System.out.println("Enter the integers between 1 and 50: ");

		while(input.hasNextInt()){
			numbers.add(input.nextInt());
		}

		int[][] ocurrence = new int[numbers.size()][2];

		int quantity = 0;

		for(int i = 0; i < numbers.size(); i++){
			int count = 0;
			ocurrence[i][0]= numbers.get(i);

			for(int j = 0; j < numbers.size();){
				if (ocurrence[i][0] == numbers.get(j)){
					count++;
					numbers.remove(j);
				}
				else{
					j++;
				}
			}
			ocurrence[i][1]= count;
			quantity++;
		}

		for (int k = 0; k < quantity; k++){
			System.out.println(ocurrence[k][0] + " occurs " + ocurrence[k][1] +" times");
		}
	}
} 