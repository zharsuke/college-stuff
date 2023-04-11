public class MinMax {
    public int [] number;
    public int amount;

    public MinMax(int amount) {
        this.amount = amount;
        number = new int[amount];
    }

    public int [] findMinMaxBruteForce(int [] number) {
        int [] result = new int[4];
        int min = number[0];
        int max = number[0];
        int idMin = 0;
        int idMax = 0;
        for (int i = 0; i < number.length; i++) {
            if (number[i] < min) {
                min = number[i];
                idMin = i;
            }
            if (number[i] > max) {
                max = number[i];
                idMax = i;
            }
        }
        result[0] = min;
        result[1] = idMin;
        result[2] = max;
        result[3] = idMax;
        return result;
     }

     public int [] findMinMaxDivideConquer(int [] number, int low, int high) {
        if (low == high) {
            return new int [] {number[low], low, number[high], high};
        } else {
            int mid = (low + high) /2;
            int [] left = findMinMaxDivideConquer(number, low, mid);
            int [] right = findMinMaxDivideConquer(number, mid+1, high);
            int min, max, idMin, idMax;
            if (left[0] < right[0]) {
                min = left[0];
                idMin = left[1];
            } else {
                min = right[0];
                idMin = right[1];
            }
            if (left[0] > right[0]) {
                max = left[2];
                idMax = left[3];
            } else {
                max = right[2];
                idMax = right[3];
            }
            return new int [] {min, idMin, max, idMax};
        }
     }
}
