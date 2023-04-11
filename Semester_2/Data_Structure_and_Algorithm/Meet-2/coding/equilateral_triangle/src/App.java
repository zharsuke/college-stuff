import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert side : ");
        double side = scanner.nextDouble();
        EquilateralTriangle equilateralTriangle = new EquilateralTriangle(side);

        equilateralTriangle.print();
    }
}
