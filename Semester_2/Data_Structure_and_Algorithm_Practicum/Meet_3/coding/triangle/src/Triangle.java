public class Triangle {
    public int base;
    public int height;

    Triangle(){

    }
    Triangle(int a, int t) {
        this.base = a;
        this.height = t;
    }

    static int countArea(int a, int t) {
        double result = 0.5 * a * t;
        int resultInt = (int) result;
        return resultInt;
    }

    static int countPerimeter(int a, int t) {
        double result = a + t + Math.sqrt(a * a + t * t);
        int resultInt = (int) result;
        return resultInt;
    }


}