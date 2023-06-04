package assnum4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        DoubleLinkedList dll = new DoubleLinkedList();

        int choose;
        do {
            menu();
            choose = sc.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("Insert student in head position");
                    System.out.print("NIM : ");
                    String nim1 = sc.next();
                    System.out.print("Name : ");
                    String name1 = sc.next();
                    System.out.print("GPA : ");
                    double gpa1 = sc.nextDouble();
                    dll.addFirst(nim1, name1, gpa1);
                    break;
                case 2:
                    System.out.println("Insert student in head position");
                    System.out.print("NIM : ");
                    String nim2 = sc.next();
                    System.out.print("Name : ");
                    String name2 = sc.next();
                    System.out.print("GPA : ");
                    double gpa2 = sc.nextDouble();
                    dll.addLast(nim2, name2, gpa2);
                    break;
                case 3:
                    System.out.println("Insert student by index");
                    System.out.print("NIM : ");
                    String nim3 = sc.next();
                    System.out.print("Name : ");
                    String name3 = sc.next();
                    System.out.print("GPA : ");
                    double gpa3 = sc.nextDouble();
                    System.out.print("Index : ");
                    int index3 = sc.nextInt();
                    dll.add(nim3, name3, gpa3, index3);
                    break;
                case 4:
                    dll.removeFirst();
                    break;
                case 5:
                    dll.removeLast();
                    break;
                case 6:
                    System.out.print("Remove data in specific index : ");
                    int index6 = sc.nextInt();
                    dll.remove(index6);
                    break;
                case 7:
                    dll.print();
                    break;
                case 8:
                    System.out.print("Search student by NIM : ");
                    String nim8 = sc.next();
                    int position = dll.sequentialSearch(nim8);
                    dll.showPosition(nim8, position);
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
        } while (choose >= 0 && choose <= 10);

        sc.close();
    }

    public static void menu() {
        System.out.println("==========================================");
        System.out.println("Student Data Management System");
        System.out.println("==========================================");
        System.out.println("Choose Menu : ");
        System.out.println("1. Add data from head");
        System.out.println("2. Add data from tail");
        System.out.println("3. Add data with index");
        System.out.println("4. remove data from head");
        System.out.println("5. Remove data from tail");
        System.out.println("6. Remove data by index");
        System.out.println("7. Print");
        System.out.println("8. Search by NIM");
        System.out.println("9. Sort by GPA");
        System.out.println("10. Exit");
        System.out.println("==========================================");
    }
}
