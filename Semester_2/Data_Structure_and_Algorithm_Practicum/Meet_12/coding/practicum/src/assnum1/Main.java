package assnum1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        DoubleLinkedList dll = new DoubleLinkedList();

        int choose;
        do {
            menu();
            choose = sc.nextInt();
            switch (choose) {
                case 1:
                    System.out.print("Insert data in head position : ");
                    int data1 = sc.nextInt();
                    dll.addFirst(data1);
                    break;
                case 2:
                    System.out.print("Insert data in tail position : ");
                    int data2 = sc.nextInt();
                    dll.addLast(data2);
                    break;
                case 3:
                    System.out.print("Insert data : ");
                    int data3 = sc.nextInt();
                    System.out.print("Insert index : ");
                    int index3 = sc.nextInt();
                    dll.add(data3, index3);
                    break;
                case 4:
                    dll.removeFirst();
                    break;
                case 5:
                    dll.removeLast();
                    break;
                case 6:
                    System.out.print("Insert index data : ");
                    int index6 = sc.nextInt();
                    dll.remove(index6);
                    break;
                case 7:
                    dll.print();
                    break;
                case 8:
                    System.out.print("Search data : ");
                    int data8 = sc.nextInt();
                    int position = dll.sequentialSearch(data8);
                    dll.showPosition(data8, position);
                    break;
                case 9:
                    dll.bubbleSort();
                    dll.print();
                    break;
                case 10:
                    System.exit(0);
                    break;
            
                default:
                    break;
            }
            
        } while (choose >= 1 && choose <= 10);

        sc.close();
    }

    public static void menu() {
        System.out.println("==========================================");
        System.out.println("Data manipulation with doule linked list");
        System.out.println("==========================================");
        System.out.println("Choose Menu : ");
        System.out.println("1. Add first");
        System.out.println("2. Add tail");
        System.out.println("3. Add data with index");
        System.out.println("4. remove first");
        System.out.println("5. Remove last");
        System.out.println("6. Remove data by index");
        System.out.println("7. Print");
        System.out.println("8. Search data");
        System.out.println("9. Sort data");
        System.out.println("10. Exit");
        System.out.println("==========================================");
    }
}
