public class TestRecntagle{
	public static void main(String[] args) {
		Rectangle rectangle1 = new Rectangle(4,40);
		Rectangle rectangle2 = new Rectangle(3.5,35.9);
		System.out.println("The width is " + rectangle1.width +
			" and the heigth is " + rectangle1.heigth);
		System.out.println("The area is " + rectangle1.getArea() + 
			" and the perimeter is " + rectangle1.getPerimeter());
		System.out.println("The width is " + rectangle2.width +
			" and the heigth is " + rectangle2.heigth);
		System.out.println("The area is " + rectangle2.getArea() + 
			" and the perimeter is " + rectangle2.getPerimeter());
	}
}