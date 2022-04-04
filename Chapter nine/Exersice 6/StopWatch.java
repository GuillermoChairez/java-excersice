public class StopWatch{
	private long startTime;
	private long endTime;

	StopWatch(){
		startTime = System.currentTimeMillis();
	}

	void start(){
		startTime = System.currentTimeMillis();
	}

	long getStartTime(){
		return startTime;
	}

	void stop(){
		endTime = System.currentTimeMillis();
	}

	long getEndTime(){
		return endTime;
	}

	long getElapsedTime(){
		return endTime - startTime;
	}

}