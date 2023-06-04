package assnum2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Stack stack = new Stack();

        int choose;
        do {
            menu();
            choose = sc.nextInt();
            switch (choose) {
                case 1:
                    System.out.print("Insert new book title : ");
                    String data = sc.next();
                    sc.nextLine();
                    stack.push(data);
                    break;
                case 2:
                    try {
                        String topElement = stack.pop();
                        System.out.println("Removed book title: " + topElement);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    try {
                        String topElement = stack.peek();
                        System.out.println("Top book title: " + topElement);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    stack.print();
                    break;
                case 5:
                    System.exit(0);
                    break;
            
                default:
                    break;
            }
        } while (choose >= 0 && choose <=5);

        sc.close();
    }

    public static void menu() {
        System.out.println("==========================================");
        System.out.println("Library data book");
        System.out.println("==========================================");
        System.out.println("Choose Menu : ");
        System.out.println("1. Add new book");
        System.out.println("2. Get book from top");
        System.out.println("3. Peek book title from top");
        System.out.println("4. Info all books");
        System.out.println("5. Exit");
        System.out.println("==========================================");
    }
}
