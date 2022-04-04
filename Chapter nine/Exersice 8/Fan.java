public class Fan{
	public static final int SLOW =1, MEDIUM = 2,FAST = 3;
	private int speed;
	private boolean on;
	private double radius;
	String color;

	Fan(){
		speed = SLOW;
		radius = 5;
		color = "blue";
	}

	void setSpeed(int speed){
		this.speed = speed;
	}
	void setOn(boolean on){
		this.on = on;
	}
	void setRadius(double radius){
		this.radius = radius;
	}
	void setColor(String color){
		this.color = color;
	}

	int getSpeed(){
		return speed;
	}
	boolean getOn(){
		return on;
	}
	double getRadius(){
		return radius;
	}
	String setColor(){
	 	return color;
	}

	public String toString(){
		if(on){
			return "The speed is " + this.speed + " the color is " 
			+ this.color + " and the radius is " + this.radius;
		}
		else {
			return "The color is " + this.color + " and the radius is " + this.radius +
			" Fan is off ";
		}
	}
}