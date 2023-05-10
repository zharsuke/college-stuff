package practicum2;

import java.util.Scanner;

public class StackMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack st = new Stack(8);
        char choose;
        int operation;
        do {
            System.out.print("Title : ");
            String title = sc.nextLine();
            System.out.print("Author Name : ");
            String name = sc.nextLine();
            System.out.print("Published Year : ");
            int year = sc.nextInt();
            System.out.print("Page Amount : ");
            int pages = sc.nextInt();
            System.out.print("Price : ");
            int price = sc.nextInt();
    
            Book bk = new Book(title, name, year, pages, price);
    
            do {
                System.out.println("Choose Operation:");
                System.out.println("1. Push");
                System.out.println("2. Pop");
                System.out.println("3. Peek");
                System.out.println("4. Print");
                System.out.println("5. Exit");
                operation = sc.nextInt();
                sc.nextLine();
    
                switch (operation) {
                    case 1:
                        st.push(bk);
                        break;
                    case 2:
                        st.pop();
                        break;
                    case 3:
                        st.peek();
                        break;
                    case 4:
                        st.print();
                        break;
                    case 5:
                        System.exit(operation);
                        break;
                    default:
                        System.out.println("Invalid operation!");
                        break;
                }
            } while (operation != 5);
    
            System.out.print("Do you want to add new data to stack (y/n) ? ");
            choose = sc.next().charAt(0);
            sc.nextLine();
        } while (choose == 'y');

        st.print();
        st.pop();
        st.peek();
        st.print();

        sc.close();
    }    
}
