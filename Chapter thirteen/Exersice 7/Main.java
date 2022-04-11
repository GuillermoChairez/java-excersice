
public class Main {

    public static void main(String[] args) {
        GeometricObject[] figures = new GeometricObject[5];
        figures[0] = new Circle(4.5);
        figures[1] = new Rectangle(2, 5);
        figures[2] = new Square(9);
        figures[3] = new Circle();

        try {
            figures[4] = new Triangle(2,7,8);
        } catch (IllegalTriangleException e) {
            figures[4] = new Triangle();
        }

        for(GeometricObject figure : figures){
            System.out.println("The area is " + figure.getArea());
            figure.howToColor();
        }
    }
}
