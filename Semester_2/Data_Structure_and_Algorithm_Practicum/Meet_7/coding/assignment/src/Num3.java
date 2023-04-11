public class Num3 {
    int [] [] number = {
        {45,78,7,200,80},
        {90,1,17,100,50},
        {21,2,40,18,65}
    };

    public int [] findSeqSearch(int search) {
        int [] position = new int[]{-1,-1};
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number[0].length; j++) {
                if (number[i][j] == search) {
                    position[0] = i;
                    position[1] = j;
                    break;
                }
            }
        }
        return position;
    }

    public void showPosition(int x, int [] pos) {
        if (pos[0] != -1 && pos[1] != -1) {
            System.out.println("Data : " + x + " is found in row-" + pos[0] + ", column-" + pos[1]);
        } else {
            System.out.println("Data : " + x + " is not found!");
        }
    }

    public void showData(int x, int [] pos) {
        if (pos[0] != -1 && pos[1] != -1) {
            System.out.println("Number \t = " + x);
        } else {
            System.out.println("Data " + x + " is not found!");
        }
    }

    public void print() {
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number[0].length; j++) {
                System.out.print(number[i][j] + " ");
            }
            System.out.println();
        }
    }
}
