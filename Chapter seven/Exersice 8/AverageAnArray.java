public class AverageAnArray{
	public static void main(String[] args) {
		int [] integers = {1, 4, 5, 6 ,7 ,4, 2, 6, 7, 3, 7};
		double [] doubles = {1, 4, 5, 6 ,7 ,4, 2, 6, 7, 3, 7};
		System.out.println("integer average: " + average(integers));
		System.out.println("double average: " + average(doubles));
		
	}

	public static int average(int[] array){
		int average;
		int size = array.length;
		int sum = 0;
		for (int i = 0; i < size; i++){
			sum += array[i];
		}
		average = sum / size;
		return average;

	}
	public static double average(double[] array){
		double average;
		int size = array.length;
		double sum = 0;
		for (int i = 0; i < size; i++){
			sum += array[i];
		}
		average = sum / size;
		return average;

	}
}
