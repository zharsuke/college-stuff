import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        PremierLeagueService data = new PremierLeagueService();
        int number = 3;

        for (int i = 0; i < number; i++) {
            System.out.print("Insert team : ");
            String team = scanner.next();
            System.out.print("Insert Play : ");
            int play = scanner.nextInt();
            System.out.print("Insert goal : ");
            int goal = scanner.nextInt();
            System.out.print("Insert points : ");
            int points = scanner.nextInt();

            PremierLeague premierLeague = new PremierLeague(team, play, goal, points);
            data.add(premierLeague);
        }
        System.out.println();

        System.out.println("List of data");
        data.displayAll();
        System.out.println();

        System.out.println("List of data after sorting using insertion sorting in ascending");
        data.insertionSort(true);
        data.displayAll();
        System.out.println();
        
        System.out.println("List of data after sorting using insertion sorting in descending");
        data.insertionSort(false);
        data.displayAll();

        scanner.close();
    }
}
