import java.util.*;
public class javab {
    public static long fac(int n) {
        long f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        return f;
    }

    public static void binomial(int n, int r) {
        if (r > n || n < 0 || r < 0) {
            System.out.println("Invalid input: ensure that 0 ≤ r ≤ n.");
            return;
        }

        long nFac = fac(n);
        long rFac = fac(r);
        long diffFac = fac(n - r);

        long binCoeff = nFac / (rFac * diffFac);
        System.out.println("Binomial coefficient is: " + binCoeff);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        System.out.println("Enter r:");
        int r = sc.nextInt();
        binomial(n, r);
    }
}
