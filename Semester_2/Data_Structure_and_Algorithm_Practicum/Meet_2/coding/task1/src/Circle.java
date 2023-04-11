public class Circle {
    double phi = 3.14, r;
    Circle() {

    }
    Circle(double r) {
        this.r = r;
    }
    double calulateArea(double r) {
        return phi * r * r;
    }
    double calculateCircumference(double r) {
        return 2 * phi * r;
    }
}
