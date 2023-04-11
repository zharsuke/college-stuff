public class TicketService {
    Tickets [] tickets = new Tickets[3];
    int index;

    void add(Tickets ticket) {
        if (index < tickets.length) {
            tickets[index] = ticket;
            index++;
        }
    }

    void displayAll() {
        for (Tickets ticket : tickets) {
        ticket.print();   
        System.out.println("=========================================");
        }        
    }

    void bubbleSort() {
        for (int i = 0; i < tickets.length-1; i++) {
            for (int j = 1; j < tickets.length-i; j++) {
                if (tickets[j].price > tickets[j-1].price) {
                    Tickets tmp = tickets[j];
                    tickets[j] = tickets[j-1];
                    tickets[j-1] = tmp;
                }
            }
        }
    }

    void selectionSort() {
        for (int i = 0; i < tickets.length-1; i++) {
            int indexMin = i;
            for (int j = i+1; j < tickets.length; j++) {
                if (tickets[j].price < tickets[indexMin].price) {
                    indexMin = j;
                }
                Tickets tmp = tickets[indexMin];
                tickets[indexMin] = tickets[i];
                tickets[i] = tmp;
            }
        }
    }
}
