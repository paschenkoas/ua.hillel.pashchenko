public class SimpleNumbers {
    public static void main(String[] args) {
        int n = 100;
        for (int i = 1; i < n; i++) {
            boolean a = true;
            int q = (int) Math.sqrt(i);
            for (int j = 2; j <= q; j++) {
                if ((i % j) == 0) {
                    a = false;
                    break;
                }
            }
            if (a) {
                System.out.print(i+" ");
            }
        }
    }
}