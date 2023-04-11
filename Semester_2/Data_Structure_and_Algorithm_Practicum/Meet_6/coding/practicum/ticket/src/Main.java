import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        TicketService data = new TicketService();
        int number = 3;
        for (int i = 0; i < number; i++) {
            System.out.print("Insert name of Airlines : ");
            String airlines = scanner.next();
            System.out.print("Insert Destination : ");
            String destination = scanner.next();
            System.out.print("Insert Origin : ");
            String origin = scanner.next();
            System.out.print("Insert Price : ");
            int price = scanner.nextInt();

            Tickets tickets = new Tickets(airlines, destination, origin, price);
            data.add(tickets);
        }
        System.out.println();

        System.out.println("List of data");
        data.displayAll();
        System.out.println();

        System.out.println("Data after sorting using selection sort in ascending");
        data.selectionSort();
        data.displayAll();
        System.out.println();

        System.out.println("Data after sorting using bubble sort in descending");
        data.bubbleSort();
        data.displayAll();


        scanner.close();
    }
}
