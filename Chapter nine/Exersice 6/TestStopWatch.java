public class TestStopWatch{
	public static void main(String[] args) {
		StopWatch watch = new StopWatch();
		watch.start();
		System.out.println("start time : " + watch.getStartTime());
		for(int i = 0; i < 100000; i++){

		}
		watch.stop();
		System.out.println("end time : " + watch.getEndTime());
		System.out.println("milliseconds : " + watch.getElapsedTime());
	}
}