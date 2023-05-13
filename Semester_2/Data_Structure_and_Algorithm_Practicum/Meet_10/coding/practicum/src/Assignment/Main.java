package Assignment;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insert maximum queue : ");
        int max = sc.nextInt();
        Queue queue = new Queue(max);

        int choose;
        do {
            menu();
            choose = sc.nextInt();
            switch (choose) {
                case 1:
                    System.out.print("nim : ");
                    String nim = sc.next();
                    sc.nextLine();
                    System.out.print("Name : ");
                    String name = sc.next();
                    sc.nextLine();
                    System.out.print("Class number : ");
                    int classNumber = sc.nextInt();
                    System.out.print("GPA : ");
                    double gpa = sc.nextDouble();
                    Student student = new Student(nim, name, classNumber, gpa);
                    sc.nextLine();
                    queue.Enqueue(student);
                    break;
                case 2:
                    Student data = queue.Dequeue();
                    if (!"".equals(data.nim) && !"".equals(data.name) && !"".equals(data.classNumber) && !"".equals(data.gpa)) {
                        System.out.println("Data removed : " + data.nim + " " + data.name + " " + data.classNumber + " " + data.gpa);
                        break;
                    }
                case 3:
                    queue.peek();
                    break;
                case 4:
                    queue.print();
                    break;
                case 5:
                    queue.clear();
                    break;
                case 6:
                    queue.peekRear();
                    break;
                case 7:
                    System.out.print("NIM : ");
                    String searchNim = sc.next();
                    sc.nextLine();
                    queue.peekPosition(searchNim);
                    break;
                case 8:
                    System.out.print("Position : ");
                    int position = sc.nextInt();
                    queue.printStudent(position);
                    break;
                default:
                    break;
            }
        } while (choose <= 8 && choose >= 1);

        sc.close();
    }

    public static void menu() {
        System.out.println("Choose Menu : ");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Peek");
        System.out.println("4. Print");
        System.out.println("5. Clear");
        System.out.println("6. Rear peek");
        System.out.println("7. Peek position");
        System.out.println("8. Print student");
        System.out.println("====================");
    }
}
