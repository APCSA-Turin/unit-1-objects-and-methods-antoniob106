public class Circle {
    private double radius;

    public Circle(double circleRadius) {
        radius = circleRadius;
    }

    public void getArea() {
       double area = radius * radius * Math.PI;
       System.out.println("A circle with radius " + radius + " has an area of " + area);
    }
}