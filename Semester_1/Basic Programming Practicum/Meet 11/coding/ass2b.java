import java.util.*;
public class ass2b {
    public static void main(String[] args) {
        
    Scanner scanner = new Scanner(System.in);
    int line, column;

    System.out.print("Insert amount of line : ");
    line = scanner.nextInt();
    System.out.print("Insert amount of column : ");
    column = scanner.nextInt();
    int [][] num = new int[line][column];

    System.out.println();

    for (int i = 0; i < num.length; i++) {
        for (int j = 0; j < num[i].length; j++) {
            System.out.print("Insert number array [" + i + "] [" + j + "] : ");
            num[i][j] = scanner.nextInt();
        }
        System.out.println();
    }

    System.out.println("Number Array = {");

    for (int i = 0; i < num.length; i++) {
        System.out.print("[");
        for (int j = 0; j < num[i].length; j++) {
            if (j > 0 && j < num[i].length) {
                System.out.print(",");
            }
            System.out.print(num[i][j]);
        }
        System.out.print("]\n");
    }
    System.out.println("}");

    System.out.println();

    int min = num[0][0];
    int min_amount = 0;

    for (int i = 0; i < num.length; i++) {
        for (int j = 0; j < num[i].length; j++) {
            if (num[i][j] < min) {
                min = num[i][j];
            }
        }
    }

    System.out.println("Smallest value = " + min);

    for (int i = 0; i < num.length; i++) {
        for (int j = 0; j < num[0].length; j++) {
            if (min == num[i][j]){
                System.out.print("Location of smallest value =  [" + i + "] [" + j + "]");
                min_amount++;
            }
        }
        System.out.println();
    }
    System.out.println("Amount of smallest value = " + min_amount);

    scanner.close();
    }
}