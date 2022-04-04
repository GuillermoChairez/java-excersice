public class MyInteger{
	int value;

	MyInteger(int value){
		this.value = value;
	}

	int getValue(){
		return this.value;
	}

	boolean isEven(){
		if(this.value%2 == 0){
			return true;
		}
		else {
			return false;
		}
	}
	boolean isOdd(){
		return !isEven();

	}
	boolean isPrime(){
		for(int i = 2 ; i < this.value ; i++){
			if(this.value % i == 0){
				return false;
			}
		}
		return true;
	}

	static boolean isEven(int value){
		if(value%2 == 0){
			return true;
		}
		else {
			return false;
		}
	}
	static boolean isOdd(int value){
		return !isEven(value);

	}
	static boolean isPrime(int value){
		for(int i = 2 ; i < value ; i++){
			if(value % i == 0){
				return false;
			}
		}
		return true;
	}

	static boolean isEven(MyInteger integer){
		if(integer.value%2 == 0){
			return true;
		}
		else {
			return false;
		}
	}
	static boolean isOdd(MyInteger integer){
		return !isEven(integer);

	}
	static boolean isPrime(MyInteger integer){
		for(int i = 2 ; i < integer.value ; i++){
			if(integer.value % i == 0){
				return false;
			}
		}
		return true;
	}

	boolean equals(int value){
		if(this.value == value){
			return true;
		}
		else {
			return false;
		}
	}

	boolean equals(MyInteger integer){
		if(this.value == integer.value){
			return true;
		}
		else {
			return false;
		}
	}

	static int parseInt(char[] array){
		int value = 0;
		for(int i = 0; i < array.length; i++){
			value += Math.pow(10,array.length - 1 -i)*(array[i] - 48);
		}
		return value;
	}

	static int parseInt(String array){
		int value = 0;
		for(int i = 0; i < array.length(); i++){
			value += Math.pow(10,array.length() - 1 -i)*(array.charAt(i) - 48);
		}
		return value;
	}

}