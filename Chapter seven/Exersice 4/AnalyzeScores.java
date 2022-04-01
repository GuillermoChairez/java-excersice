import java.util.Scanner;
import java.util.ArrayList;
public class AnalyzeScores{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		System.out.println("Enter the scores: ");

		while(input.hasNextInt()){
			int num = input.nextInt();
			if(num < 0){
				break;
			}
			else{
				numbers.add(num);
			}

		}

		final int SIZE = numbers.size();
		int total = 0;
		int aboveAverage = 0;
		int belowAverage = 0;

		for(int i = 0; i < SIZE; i++){
			total += numbers.get(i);
		}

		int average = total/SIZE;

		for (int k = 0; k < SIZE; k++){
			if(numbers.get(k) >=  average){
				aboveAverage++;
			}
			else{
				belowAverage++;
			}
		}

		System.out.println("There are " + aboveAverage +" numbers Above or equals the average");
		System.out.println("There are " + belowAverage +" numbers Below the average");
	}
} 