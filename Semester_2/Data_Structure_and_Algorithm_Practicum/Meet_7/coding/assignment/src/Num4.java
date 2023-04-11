public class Num4 {
    int [] number = {12,17,2,1,70,50,90,17,2,90};

    void bubbleSort() {
        for (int i = 0; i < number.length-1; i++) {
            for (int j = 1; j < number.length-i; j++) {
                if (number[j] < number[j-1]) {
                    // swap
                    int tmp = number[j];
                    number[j] = number[j-1];
                    number[j-1] = tmp;
                }
            }
        }
    }

    int [] findMaxBruteForce() {
        int [] result = new int[2];
        int max = number[0], amount = 0;
        for (int i = 0; i < number.length; i++) {
            if (number[i] > max) {
                max = number[i];
                amount = 1;
            } else {
                amount++;
            }
        }
        result[0] = max;
        result[1] = amount;
        return result;
    }

    public int findSeqSearch(int search) {
        int position = -1;
        for (int i = 0; i < number.length; i++) {
            if (number[i] == search) {
                position = i;
                break;
            }
        }
        return position;
    }

    public void showPosition(int x, int pos) {
        if (pos != -1) {
            System.out.println("Data : " + x + " is found in index-" + pos);
        } else {
            System.out.println("Data : " + x + " is not found!");
        }
    }

    public void showData(int x, int pos) {
        if (pos != -1) {
            System.out.println("Number \t = " + x);
        } else {
            System.out.println("Data " + x + " is not found!");
        }
    }

    void print() {
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
        }
    }
}
