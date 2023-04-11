import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int base, height;
        float area;

        System.out.print("Insert base : ");
        base = scanner.nextInt();

        System.out.print("Insert height : ");
        height = scanner.nextInt();

        area = base * height / 2;

        System.out.println("Area of triangle is "+ area);
        
    }
}
