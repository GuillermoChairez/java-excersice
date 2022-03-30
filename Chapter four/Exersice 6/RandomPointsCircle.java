public class RandomPointsCircle{
	public static void main(String[] args) {
		final double pi = Math.PI;
		final int radius = 40;
		double angle1, angle2, angle3;
		double alpha  = Math.random()*(2*pi);
		double betha  = Math.random()*(2*pi);
		double gamma  = Math.random()*(2*pi);
		double x1,y1,x2,y2,x3,y3;

		x1 = radius*Math.cos(alpha);
		y1 = radius*Math.sin(alpha);
		x2 = radius*Math.cos(betha);
		y2 = radius*Math.sin(betha);
		x3 = radius*Math.cos(gamma);
		y3 = radius*Math.sin(gamma);

		double m1 = (y2 - y1)/(x2 - x1);
		double m2 = (y3 - y1)/(x3 - x1);
		double m3 = (y3 - y2)/(x3 - x2);

		angle1 = Math.atan(Math.abs((m2-m1)/(1+m2*m1)));
		angle2 = Math.atan(Math.abs((m3-m1)/(1+m3*m1)));
		angle3 = Math.atan(Math.abs((m3-m2)/(1+m3*m2)));

		System.out.println("The point 1 is (" + x1 + "," + y1 + ")");
		System.out.println("The point 2 is (" + x2 + "," + y2 + ")");
		System.out.println("The point 3 is (" + x3 + "," + y3 + ")");
		System.out.println("The angles are: ");
		System.out.println(angle1);
		System.out.println(angle2);
		System.out.println(angle3);

	}
}