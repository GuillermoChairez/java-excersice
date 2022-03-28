import java.util.Scanner;

public class CheckISBN{
	public static void main(String[] args) {
		int value;
		String isbn;
		int d10 = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first 9 digits of an ISBN as integer: ");
		isbn = input.next();

		for(int i = 0; i < isbn.length() ; i++){
			value = isbn.charAt(i) - 48;
			d10 = d10 + value*(i + 1);
		}

		d10 = d10%11;
		if(d10 == 10){
			System.out.println("The ISBN-10 number is " + isbn + "X");
		}
		else{
			System.out.println("The ISBN-10 number is " + isbn + d10);
		}
	}
}