package Week3;

public class Factorial {
    public int num;
    // Factorial(int num) {
    //     this.num = num;
    // }
    public int factorialBF(int num) {
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }
    public int factorialDC(int num) {
        if (num == 1) {
            return 1;
        } else {
            return num * factorialDC(num -1);
        }
    }
}
