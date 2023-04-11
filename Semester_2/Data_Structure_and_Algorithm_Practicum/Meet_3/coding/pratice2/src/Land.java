public class Land {
    public int length, width;
    public Land(int length, int width) {
        this.length = length;
        this.width = width;
    }
    public int calculateArea() {
        return length * width;
    }
}
