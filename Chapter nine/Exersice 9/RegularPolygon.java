public class RegularPolygon{
	private int n;
	private double side;
	private double x;
	private double y;

	RegularPolygon(){
		this.side = 1;
		this.n = 3;
	}
	RegularPolygon(int n, double side){
		this.n = n;
		this.side = side;
	}
	RegularPolygon(int n, double side, double x, double y){
		this.n = n;
		this.side = side;
		this.x = x;
		this.y = y;
	}

	void setN(int n){
		this.n = n;
	}
	void setSide(double side){
		this.side = side;
	}
	void setX(double x){
		this.x = x;
	}
	void setY(double y){
		this.y = y;
	}
	int getN(){
		return n;
	}
	double getSide(){
		return side;
	}
	double getX(){
		return  x;
	}
	double getY(){
		return y;
	}

	double getPerimeter(){
		return n*side;
	}
	double getArea(){
		return (n*side*side)/(4*Math.tan(Math.PI/n));
	}

}