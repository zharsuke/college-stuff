public class question3 {
    public static void main(String[] args) {
        
        int [][] stock = {
            {10, 15, 15, 7},
            {6, 11, 9, 12},
            {2, 10, 10, 5},
            {5, 7, 12, 9}
        };
        
        int [] price = {75_000, 50_000, 60_000, 10_000};

        String [] branch = {"Royal Garden 1", "Royal Garden 2", "Royal Garden 3", "Royal Garden 4"};

        String [] flower = {"Aglaonema", "Taro", "Alocasia", "Rose"};

        int [] flowerStock = new int [4];

        for (int i = 0; i < stock.length; i++) {
            System.out.print(branch[i] + " = ");
            for (int j = 0; j < stock[i].length; j++) {
                System.out.print(stock[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < stock[0].length; i++) {
            int flowerTotal = 0;
            for (int j = 0; j < stock.length; j++) {
                flowerTotal += stock[j][i];
            }
            flowerStock[i] = flowerTotal;
        }
        
        for (int i = 0; i < flowerStock.length; i++) {
            System.out.print(flower[i] + " = ");
            System.out.println(flowerStock[i]);
        }

        System.out.println();

        stock[0][0] -= 1;
        stock[0][1] -= 2;
        stock[0][3] -= 5;

        int totalIncome = 0;

        for (int i = 0; i < flower.length; i++) {
            totalIncome += stock[i][0] * price[i];
        }

        System.out.printf("Total income Royal Garden 1 = %,d\n", totalIncome);

    }
}
