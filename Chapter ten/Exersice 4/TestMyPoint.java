public class TestMyPoint{
	public static void main(String[] args) {
		MyPoint p1 = new MyPoint();
		MyPoint p2 = new MyPoint(10,30.5);
		System.out.println("The distance between (" + p1.getX() + "," + p1.getY() + ") " 
			+ "and (" + p2.getX() + "," + p2.getY() + ") is " + MyPoint.distance(p1,p2));
	}
}