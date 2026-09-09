import shapes.Shape;

public class Main {
    public static void main(String[] args) {

        Shape s = new Shape();

        double rectangleArea = s.rectangleArea(10, 5);
        double circleArea = s.circleArea(7);

        System.out.println("Area of Rectangle: " + rectangleArea);
        System.out.println("Area of Circle: " + circleArea);
    }
}
