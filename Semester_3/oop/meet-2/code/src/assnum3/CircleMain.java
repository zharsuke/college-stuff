package assnum3;

public class CircleMain {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        circle1.r = 10;
        System.out.println("Radius: " + circle1.r);
        System.out.println("Area: " + circle1.calculateArea());
        System.out.println("Circumference: " + circle1.calculateCircumference());
    }
}
