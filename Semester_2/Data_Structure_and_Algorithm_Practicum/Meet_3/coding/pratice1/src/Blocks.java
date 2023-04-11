public class Blocks {
    public double length, width, height;
    Blocks(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }
    public double calculateVolume() {
        return length * width * height;
    }
    public double calculateSurfaceArea() {
        return 2 * (length * width + length * height + width * height);
    }
    public void display() {
        System.out.println("Volume of blocks = " + calculateVolume());
        System.out.println("Surface area of blocks = " + calculateSurfaceArea());
    }
}
