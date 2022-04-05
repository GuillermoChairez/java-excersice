import java.util.*;
public class DisplayPrimeNumbers{
	public static void main(String[] args) {
		int value = 120;
		Stack<Integer> stack = new Stack<Integer>();
		boolean prime = true;
		stack.push(1); 
		for(int i = 2; i <= value; i++){
			prime = true;
			for(int j = i - 1; j >= 2; j--){
				if(i%j == 0){
					prime = false;
					break;
				}
			}
			if (prime){
				stack.push(i);
			}
		}

		while(!stack.empty()){
			System.out.println(stack.pop());
		}
	}
}