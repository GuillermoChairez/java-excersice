public class Main {

    public static void main(String[] args) {
        ComparableCircle circle1 = new ComparableCircle(4);
        ComparableCircle cirlce2 = new ComparableCircle(6);
        GeometricObject triangle1;

        try {
            triangle1 = new Triangle(2, 5, 7);
        }catch(IllegalTriangleException e){
            triangle1 = new Triangle();
        }

        System.out.println("the larger circle is " + circle1.compareTo(cirlce2));
        System.out.println("The greater geometric object is " + circle1.compareTo(triangle1));
    }
}
