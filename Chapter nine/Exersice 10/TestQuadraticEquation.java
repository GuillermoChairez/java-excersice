public class TestQuadraticEquation{
	public static void main(String[] args) {
		QuadraticEquation x = new QuadraticEquation(1,-6,-9);
		double discriminant = x.getDiscriminant();
		if(discriminant > 0){
			System.out.println("root 1: " + x.getRoot1());
			System.out.println("root 2: " + x.getRoot2());
		}
		else if (discriminant == 0){
			System.out.println("roots: " + x.getRoot1());
		}
		else{
			System.out.println("The equation has no real solutions");
		}
	}
}