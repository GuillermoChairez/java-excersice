public class NumbersDivisibleby3and4{
	public static void main(String[] args){
		int count = 100;
		int jump = 0;
		while(count <= 1000){
			if (count % 3 == 0 && count % 4 == 0){
				System.out.print(count + " ");
				jump++;
				
				if (jump == 10){
					System.out.println("");
					jump = 0;
				}
			}
			count++;
		}
	}
}