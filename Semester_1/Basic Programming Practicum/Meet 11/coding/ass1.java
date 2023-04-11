public class ass1 {
    public static void main(String[] args) {
        
        // char [] plate = new char[10];

        char [] plate = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L','N', 'T'};

        char [] [] city = {
            {'B', 'A', 'N', 'T', 'E', 'N'},
            {'J', 'A', 'K', 'A', 'R', 'T', 'A'},
            {'B', 'A', 'N', 'D', 'U', 'N', 'G'},
            {'C', 'I', 'R', 'E', 'B', 'O', 'N'},
            {'B', 'O', 'G', 'O', 'R'},
            {'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N'},
            {'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G'},
            {'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A'},
            {'M', 'A', 'L', 'A', 'N', 'G'},
            {'T', 'E', 'G', 'A', 'L'}
        };

        for (int i = 0; i < city.length; i++) {
            System.out.print(plate[i] + " = ");
            for (int j = 0; j < city[i].length; j++) {
                System.out.print(city[i][j] + " ");
            }
            System.out.println();
        }

    }
}