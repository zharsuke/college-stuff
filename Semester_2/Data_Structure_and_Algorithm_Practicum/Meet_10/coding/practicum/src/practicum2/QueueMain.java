package practicum2;

import java.util.Scanner;

public class QueueMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insert maximum queue : ");
        int max = sc.nextInt();
        QueuePassengers queuePassengers = new QueuePassengers(max);

        int choose;
        do {
            menu();
            choose = sc.nextInt();
            switch (choose) {
                case 1:
                    System.out.print("Name : ");
                    String name = sc.next();
                    sc.nextLine();
                    System.out.print("City origin : ");
                    String cityOrigin = sc.next();
                    sc.nextLine();
                    System.out.print("City destination : ");
                    String cityDestination = sc.next();
                    sc.nextLine();
                    System.out.print("Ticket amount : ");
                    int ticketAmount = sc.nextInt();
                    System.out.print("Price : ");
                    int price = sc.nextInt();
                    Passengers p = new Passengers(name, cityOrigin, cityDestination, ticketAmount, price);
                    sc.nextLine();
                    queuePassengers.Enqueue(p);
                    break;
                case 2:
                    Passengers data = queuePassengers.Dequeue();
                    if (!"".equals(data.name) && !"".equals(data.cityOrigin) && !"".equals(data.cityDestination) && !"".equals(data.ticketAmount) && !"".equals(data.price)) {
                        System.out.println("Data removed : " + data.name + " " + data.cityOrigin + " " + data.cityDestination + " " + data.ticketAmount + " " + data.price);
                        break;
                    }
                case 3:
                    queuePassengers.peek();
                    break;
                case 4:
                    queuePassengers.print();
                
                    break;
                case 5:
                    queuePassengers.peekRear();
                    break;
                default:
                    break;
            }
        } while (choose <= 4 && choose >= 1);

        sc.close();
    }

    public static void menu() {
        System.out.println("Choose Menu : ");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Check first queue");
        System.out.println("4. Check all queue");
        System.out.println("5. Peek rear");
        System.out.println("====================");
    }
}
