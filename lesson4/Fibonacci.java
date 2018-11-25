public class Fibonacci {

    private static int fib(int i) {
        if (i <= 0) {
            return 0;
        } else if (i == 1) {
            return 1;
        } else if (i == 2) {
            return 1;
        } else {
            return fib(i - 1) + fib(i - 2);
        }
    }
    public static void main(String[] args) {
        int n = 12;
        for (int j = 1; j <= n; j++) {
            System.out.print(fib(j)+" ");
        }
    }
}
