public class PrimeNumber{
	public static void main(String[] args) {
		int count = 0;
		int n = 1;
		while(true){
			if(isPrime(n)){
				count++;
			}
			else if (n == 10000){
				break;
			}
			n++;
		}
		System.out.println("The number of prime numbers less than 10000 is " + count);
		
	}
	public static boolean isPrime(int number){
		int n = number/2;
		while(n > 1){
			if (number%n == 0){
				return false;
			}
			n--;
		}
		return true;
	}
}