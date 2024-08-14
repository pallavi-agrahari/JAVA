import java.util.*;

public class fibonacci {
    static int nthfibonacci(int n) {
        // base case
        if (n == 0 || n == 1) {
            return n;
        }
        // self work=subproblem+subproblem
        int ans = nthfibonacci(n - 1) + nthfibonacci(n - 2);
        return ans;
    }

    static void iterative(int n) {
        int a = 0;
        int b = 1;
        System.out.print(a + " " + b + " ");
        int c;
        for (int i = 2; i < n; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(nthfibonacci(n));
        iterative(n);
    }
}