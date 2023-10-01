package assnum3;

public class Circle {
    public double phi = 3.14, r;

    public double calculateArea() {
        return phi * r * r;
    }

    public double calculateCircumference() {
        return 2 * phi * r;
    }
}
