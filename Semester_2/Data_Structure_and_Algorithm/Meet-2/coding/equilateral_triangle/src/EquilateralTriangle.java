public class EquilateralTriangle {
    double side;
    EquilateralTriangle(double side) {
        this.side = side;
    }
    double calCircumference(double side) {
        double circumference = side*3;
        return circumference;
    }
    double calArea(double side) {
        double area = (Math.sqrt(3) / 4) * side * side;
        return area;
    }
    void print() {
        System.out.println("Circumference = " + calCircumference(side));
        System.out.println("Area = " + calArea(side));

    }
}
