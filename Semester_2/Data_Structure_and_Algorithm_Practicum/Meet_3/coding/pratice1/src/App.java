import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert amount of 3d geometry : ");
        int amount = scanner.nextInt();
        Cube [] cubes = new Cube[amount];
        Blocks [] blocks = new Blocks[amount];
        Cylinder [] cylinders = new Cylinder[amount];

        for (int i = 0; i < amount; i++) {
            System.out.print("Insert side of cube : ");
            double side = scanner.nextDouble();
            cubes[i] = new Cube(side);
            System.out.print("Insert length of blocks : ");
            double length = scanner.nextDouble();
            System.out.print("Insert width of blocks : ");
            double width = scanner.nextDouble();
            System.out.print("Insert height of blocks : ");
            double heightBlocks = scanner.nextDouble();
            blocks[i] = new Blocks(length, width, heightBlocks);
            System.out.print("Insert radius of cylinder : ");
            double radius = scanner.nextDouble();
            System.out.print("Insert height of cylinder : ");
            double heightCylinders = scanner.nextDouble();
            cylinders[i] = new Cylinder(radius, heightCylinders);
        }
        System.out.println();

        for (int i = 0; i < amount; i++) {
            cubes[i].display();
            blocks[i].display();
            cylinders[i].display();
            System.out.println();
        }
    }
}
