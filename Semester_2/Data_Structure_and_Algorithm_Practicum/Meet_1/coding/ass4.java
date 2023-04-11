import java.util.*;

public class ass4 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        int choices;
        System.out.println("Menu");
        System.out.println("1. Triangle");
        System.out.println("2. Rectangle");
        System.out.println("3. Circle\n");
        System.out.print("Choose number : ");
        choices = scanner.nextInt();
        menu(choices);

    }
    public static void menu(int choices) {
        switch (choices) {
            case 1:
                double base, height;
                System.out.print("Insert base : ");
                base = scanner.nextDouble();
                System.out.print("Insert height : ");
                height = scanner.nextDouble();
                double areaTriangle = triangle(base, height);
                System.out.println("Area of triangle = " + areaTriangle);
                break;
            case 2:
                int length, width;
                System.out.print("Insert length : ");
                length = scanner.nextInt();
                System.out.print("Insert width : ");
                width = scanner.nextInt();
                int areaRectangle = rectangle(length, width);
                System.out.println("Area of rectangle = " + areaRectangle);
                break;
            case 3:
                double r;
                System.out.print("Insert radius : ");
                r = scanner.nextDouble();
                circle(r);
                double areaCircle = circle(r);
                System.out.println("Area of circle = " + areaCircle);
                break;
            default:
                System.out.println("Invalid number!!!");
                break;
        }
    }
    public static int rectangle(int length, int width) {
        int area = length * width;
        return area;
    }
    public static double triangle(double base, double height) {
        double area = 0.5 * base * height;
        return area;
    }
    public static double circle(double r) {
        double area = 3.14 * r * r;
        return area;
    }
}
