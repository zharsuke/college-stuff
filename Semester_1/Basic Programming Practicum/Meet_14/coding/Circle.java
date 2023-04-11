import java.util.*;

public class Circle {

    static double circumFerenceCircle(double r) {
        double circumFerence = 0, phi = 3.14;
        circumFerence = phi * 2 * r;
        System.out.printf("Circum ference circle = %.2f\n", circumFerence);
        return circumFerence;
    }

    static double areaCircle(double r) {
        double area = 0, phi = 3.14;
        area = phi * r * r;
        System.out.printf("Area of circle = %.2f\n", area);
        return area;
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        double r;

        System.out.print("Insert radius of circle : ");
        r = scanner.nextDouble();

        circumFerenceCircle(r);
        areaCircle(r);

        scanner.close();
    }   
}