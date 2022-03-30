public class SquareMeter2Ping{
	public static void main(String[] args) {
		int ping = 10;
		double meter;
		int meter2 = 30;
		double ping2;
		System.out.println("Ping 	Square meter | Square meter 	Ping");
		while(ping <= 80){
			meter = ping*3.305;
			ping2 = meter2/ 3.305;
			System.out.format("%d 		%.3f 		| %d 		%.3f \n",ping,meter,meter2,ping2);
			ping+=5;
			meter2 +=5;
		}
	}
}