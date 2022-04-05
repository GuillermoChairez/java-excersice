import java.util.*;
public class DisplayPrimeFactors{
	public static void main(String[] args) {
		int value = 120;
		Stack<Integer> stack = new Stack<Integer>();
		for(int i = 2; i <= value;){
			if(value%i == 0){
				stack.push(i);
				value = value/i;
			}
			else{
				i++;
			}	
		}

		while(!stack.empty()){
			System.out.println(stack.pop());
		}
	}
}