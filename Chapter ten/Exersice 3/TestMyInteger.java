public class TestMyInteger{
	public static void main(String[] args) {
		MyInteger i1 = new MyInteger(13);
		MyInteger i2 = new MyInteger(47);
		char[] arrayChar = {'1','5','4'};
		String arrayString = "3265";
		System.out.println("My integer 1 is " + i1.getValue());
		System.out.println("My integer 1 is odd " + i1.isOdd());
		System.out.println("My integer 1 is even " + i1.isEven());
		System.out.println("My integer 1 is prime " + i1.isPrime());
		System.out.println("Number 27 is odd " + MyInteger.isOdd(27));
		System.out.println("Number 27 is even " + MyInteger.isEven(27));
		System.out.println("Number 27 is prime " + MyInteger.isPrime(27));
		System.out.println("My integer 2 is odd " + MyInteger.isOdd(i2));
		System.out.println("My integer 2 is even " + MyInteger.isEven(i2));
		System.out.println("My integer 2 is prime " + MyInteger.isPrime(i2));
		System.out.println("My integer 1 is equals to 27 " + i1.equals(27));
		System.out.println("My integer 1 is equals to My integer 2 " + i1.equals(i2));
		System.out.println("The value of ['1','5','4'] " + MyInteger.parseInt(arrayChar));
		System.out.println("The value of 3265 " + MyInteger.parseInt(arrayString));

	}
}