package shapes;

public class Shape {

    // Method to calculate area of rectangle
    public double rectangleArea(double length, double width) {
        return length * width;
    }

    // Method to calculate area of circle
    public double circleArea(double radius) {
        return Math.PI * radius * radius;
    }
}
