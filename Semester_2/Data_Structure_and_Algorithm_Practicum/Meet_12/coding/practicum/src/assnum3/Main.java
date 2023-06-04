package assnum3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue queue = new Queue();

        int choose;
        do {
            menu();
            choose = sc.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("Add new queue");
                    System.out.print("Queue number : ");
                    int number = sc.nextInt();
                    System.out.print("Name : ");
                    String name = sc.next();
                    queue.enqueue(number, name);
                    break;
                case 2:
                    try {
                        System.out.println("Removing vaccine queue");
                        queue.dequeue();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    queue.print();
                    System.out.println("Current queue length: " + queue.size());
                    break;
                case 4:
                    System.exit(0);
                    break;
            
                default:
                    break;
            }
        } while (choose >= 0 && choose <= 4);

        sc.close();
    }

    public static void menu() {
        System.out.println("==========================================");
        System.out.println("Extravaganza Vaccine Queue");
        System.out.println("==========================================");
        System.out.println("Choose Menu : ");
        System.out.println("1. Add Vaccine queue");
        System.out.println("2. Remove vaccine queue");
        System.out.println("3. Display vaccine queue");
        System.out.println("4. Exit");
        System.out.println("==========================================");
    }
}
