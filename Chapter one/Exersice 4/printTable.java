public class printTable{
	public static void main(String[] args) {
		System.out.println("a 	a^2 	a^3 	a^4");
		for(int i= 1; i <= 4; i++){
			System.out.print("\n");
			for(int j = 1; j <= 4; j++){
				System.out.print(Math.pow(i,j) + "	");
			}
		}
	}
}