import java.util.ArrayList;
public class CountSingleDigits{
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		int number;

		for(int i = 1; i <= 200; i++){
			number = (int) (Math.random()*9);
			numbers.add(number);
			System.out.print(number + " ");
			if (i%20 == 0){
				System.out.println("");
			}
		}

		int[][] ocurrence = new int[10][2];

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