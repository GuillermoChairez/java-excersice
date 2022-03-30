public class FutureTuition{
	public static void main(String[] args) {
		double tuition = 10000;
		final double increase = 0.06;
		int years = 1;

		while(years <= 14){
			tuition = tuition*(1 + increase);
			if (years == 10){
				System.out.println("the tuition after 10 years is : "+ tuition);
			}
			years++;
		}
		System.out.println("the tuition after 14 years is : "+ tuition);
	}
}