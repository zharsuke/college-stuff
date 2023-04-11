import java.util.Scanner;

public class Arr3 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int line, column;

        System.out.print("Insert amount of line array : ");
        line = input.nextInt();
        System.out.print("Insert amount of column array : ");
        column = input.nextInt();

        int [] [] number = new int[line][column];

        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number[0].length; j++) {
                System.out.print("Enter a number [" + i + "] [" + j + "]: ");
                number[i][j] = input.nextInt();
            }
            System.out.println("---------------");
        }

        for (int[] l : number) {
            for (int r : l) {
                System.out.print(r + " ");
            }
            System.out.println();
        }

        input.close();
    }   
}