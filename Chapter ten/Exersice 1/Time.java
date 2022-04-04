import java.time.LocalDateTime;
public class Time{
	int hour;
	int minute;
	int second;

	Time(){
		this.hour = LocalDateTime.now().getHour();
		this.minute =  LocalDateTime.now().getMinute();
		this.second =  LocalDateTime.now().getSecond();
	}
	Time(long miliseconds){
		this.second = (int)((miliseconds/1000)%60);
		this.minute = (int)((miliseconds/(1000*60))%60);
		this.hour = (int)((miliseconds/(1000*60*60))%24);
	}
	Time(int hour,int minute, int second){
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	int getSecond(){
		return second;
	}
	int getMinute(){
		return minute;
	}
	int getHour(){
		return hour;
	}

	void setTime(long elapseTime){
		this.second += (elapseTime/1000);
		this.minute += this.second/60;
		this.hour +=  this.minute/60;

		this.second = this.second%60;
		this.minute = this.minute%60;
		this.hour = this.hour%24;
	}
}