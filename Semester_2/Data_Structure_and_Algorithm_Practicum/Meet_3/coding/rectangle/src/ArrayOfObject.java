import java.util.Scanner;

public class ArrayOfObject {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert amount of rectangle : ");
        int amount = scanner.nextInt();
        Rectangle [] rectangleArray = new Rectangle[amount];
    
        for (int i = 0; i < rectangleArray.length; i++) {
            rectangleArray[i] = new Rectangle();
            System.out.println("Rectangle " + i);

            System.out.print("Input length : ");
            rectangleArray[i].length = scanner.nextInt();

            System.out.print("Input width : ");
            rectangleArray[i].width = scanner.nextInt();
        }

        for (int i = 0; i < rectangleArray.length; i++) {
            System.out.println("Rectangle " + i);
            System.out.println("Width : " + rectangleArray[i].width + ", length : " + rectangleArray[i].length);
        }
    
    }
}
