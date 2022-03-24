public class ApproximatePi{
	public static void main(String[] args) {
		double sum = 0;
		boolean sign = true;
		for(int i = 1; i<=11; i++){
			if(i%2 != 0){
				if(sign){
					sum = sum + 1.0/i;
					sign = false;
				}
				else {
					sum = sum - 1.0/i;
					sign = true;
				}
			}
		}
		System.out.println(4*sum);
	}
}