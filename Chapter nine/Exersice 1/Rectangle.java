public class Rectangle{
	double width = 1;
	double heigth = 1;

	Rectangle(){
	}

	Rectangle(double width, double heigth){
		this.width = width;
		this.heigth = heigth;
	}

	double getArea(){
		return width*heigth;
	}

	double getPerimeter(){
		return 2*width + 2* heigth;
	}
}