public class ass3 {
    public static void main(String[] args) {
        
        int [][] building = {
           //pa  pu  ra  bu
            {10, 25, 20, 25}, // a
            {15, 23, 15, 25}, // b
            {12, 12, 19, 23}, // c
            {13, 10, 28, 20}  // d
        };

        int [] price = {3000, 2500, 4000, 44500};

        for (int i = 0; i < building.length; i++) {
            int total = 0;
            for (int j = 0; j < building[i].length; j++) {
                total += building[i][j] * price[i];
            }
            System.out.printf("Total = %,d", total);
            System.out.println();
        }

    }
}
