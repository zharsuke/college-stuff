public class PremierLeagueService {
    PremierLeague [] leagues = new PremierLeague[3];
    int index;

    void add(PremierLeague p) {
        if (index < leagues.length) {
            leagues[index] = p;
            index++;
        }
    }

    void displayAll() {
        for (PremierLeague premierLeague : leagues) {
            premierLeague.print();
            System.out.println();
            System.out.println("==================================");
        }
    }

    void insertionSort(boolean asc) {
        for (int i = 1; i < leagues.length; i++) {
            PremierLeague tmp = leagues[i];
            int j;
            if (asc) {
                for (j = i-1; j >= 0 && leagues[j].points > tmp.points; j--) {
                    leagues[j+1] = leagues[j];
                }
            } else {
                for (j = i-1; j >= 0 && leagues[j].points < tmp.points; j--) {
                    leagues[j+1] = leagues[j];
                }
            }
            leagues[j+1] = tmp;
        }
    }
}
