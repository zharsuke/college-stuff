public class Blocks {
    public int width, length, height;

    public Blocks(int p, int l, int t) {
        this.width = p;
        this.length = l;
        this.height = t;
    }

    public int countVolume() {
        return length * width * height;
    }
}
