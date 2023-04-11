import java.util.*;;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int amount, length, width;
        System.out.print("Insert amount of land : ");
        amount = scanner.nextInt();
        Land [] lands = new Land[amount];

        for (int i = 0; i < amount; i++) {
            System.out.printf("Insert length of %d land : ", (i+1));
            length = scanner.nextInt();
            System.out.printf("Insert width of %d land : ", (i+1));
            width = scanner.nextInt();
            lands[i] = new Land(length, width);
        }
        System.out.println();

        for (int i = 0; i < amount; i++) {
            System.out.println((i+1) + " Land area = " + lands[i].calculateArea());
        }
        System.out.println();

        int max = lands[0].calculateArea();
        int idMax = 0;
        for (int i = 0; i < amount; i++) {
            if (lands[i].calculateArea() > max) {
                max = lands[i].calculateArea();
                idMax = i;
            }
        }
        System.out.println("The widest land is Land " + (idMax+1));
        System.out.println("Widest land = " + max);

    }
}
