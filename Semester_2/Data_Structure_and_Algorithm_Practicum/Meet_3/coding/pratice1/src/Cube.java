public class Cube {
    public double side;
    Cube(double side) {
        this.side = side;
    }
    public double calculateVolume() {
        return side * side * side;
    }
    public double calculateSurfaceArea() {
        return 6 * side * side;
    }
    public void display() {
        System.out.println("Volume of cube = " + calculateVolume());
        System.out.println("Surface area of cube = " + calculateSurfaceArea());
    }
}
