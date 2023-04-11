package Week3;

public class Sum {
    public int element;
    public double profit[], total;
    public Sum(int element) {
        this.element = element;
        profit = new double[element];
        total = 0;
    }
    public double totalBF(double arr[]) {
        for (int i = 0; i < element; i++) {
            total += arr[i];
        }
        return total;
    }
    public double totalDC(double arr[], int l, int r) {
        if (l == r) {
            return arr[l];
        } else if (l < r) {
            int mid = (l+r)/2;
            double lsum = totalDC(arr, l, mid-1);
            double rsum = totalDC(arr, mid+1, r);
            return lsum+rsum+arr[mid];
        }
        return 0;
    }
}
