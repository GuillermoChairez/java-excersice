public class PentagonalNumbers{
	public static void main(String[] args) {
		int n = 1;
		while (n <= 100){
			System.out.format("%6d ",getPentagonalNumber(n));
			if (n%10 == 0){
				System.out.println("");
			}
			n++;
		}
		
	}

	public static int getPentagonalNumber(int n){
		return (n*(3*n - 1)/2);
	}
}
