import java.util.Scanner;

public class Pratice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert amount of number = ");
        int amount = scanner.nextInt();
        int [] number = new int[amount];

        for (int i = 0; i < amount; i++) {
            System.out.print("Insert number = ");
            number[i] = scanner.nextInt();
        }
        System.out.println();

        for (int i = 0; i < amount; i++) {
            System.out.print(number[i] + " ");
        }
        System.out.println();
        System.out.println();
        
        System.out.println("After sorting using bubble sort");
        bubbleSort(number);
        for (int i = 0; i < amount; i++) {
            System.out.print(number[i] + " ");
        }

        System.out.println();
        System.out.println();

        System.out.println("After sorting using selection sort");
        selectionSort(number);
        for (int i = 0; i < amount; i++) {
            System.out.print(number[i] + " ");
        }

        System.out.println();
        System.out.println();

        System.out.println("After sorting using insertion sort");
        insertionSort(number);
        for (int i = 0; i < amount; i++) {
            System.out.print(number[i] + " ");
        }



        scanner.close();
    }

    static void bubbleSort(int [] number) {
        for (int i = 0; i < number.length-1; i++) {
            for (int j = 1; j < number.length-i; j++) {
                if (number[j] < number[j-1]) {
                    int tmp = number[j];
                    number[j] = number[j-1];
                    number[j-1] = tmp;
                }
            }
        }
    }

    static void selectionSort(int [] number) {
        for (int i = 0; i < number.length-1; i++) {
            int idxMin = i;
            for (int j = i+1; j < number.length; j++) {
                if (number[j] < number[idxMin]) {
                    idxMin = j;
                }
                int tmp = number[idxMin];
                number[idxMin] = number[i];
                number[i] = tmp;
            }
        }
    }

    static void insertionSort(int [] number) {
            for (int i = 1; i < number.length; i++) {
                int tmp = number[i];
                int j;
                for (j = i-1; j >= 0 && number[j] > tmp; j--) {
                    number[j+1] = number[j];
                }
                number[j+1] = tmp;
            }
    }
}
