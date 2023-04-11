public class Cylinder {
    public double radius, height;
    Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }
    public double calculateVolume() {
        return 3.14 * radius * radius * height;
    }
    public double calculateSurfaceArea() {
        return 2 * 3.14 * radius * height + 2 * 3.14 * radius * radius;
    }
    public void display() {
        System.out.println("Volume of cylinder = " + calculateVolume());
        System.out.println("Surface area of cylinder = " + calculateSurfaceArea());
    }
}
