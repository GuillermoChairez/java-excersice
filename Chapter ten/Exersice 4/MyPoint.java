public class MyPoint{
	double x;
	double y;

	MyPoint(){

	}
	MyPoint(double x, double y){
		this.x = x;
		this.y = y;
	}

	double getX(){
		return this.x;
	}
	double getY(){
		return this.y;
	}

	double distance(MyPoint point){
		return Math.sqrt((this.x -point.x)*(this.x -point.x) + (this.y - point.y)*(this.y -point.y));
	}

	double distance(double x, double y){
		return Math.sqrt((this.x - x)*(this.x -x) + (this.y - y)*(this.y -y));
	}

	static double distance(MyPoint p1,MyPoint p2){
		return Math.sqrt((p1.x -p2.x)*(p1.x -p2.x) + (p1.y - p2.y)*(p1.y -p2.y));
	}


}