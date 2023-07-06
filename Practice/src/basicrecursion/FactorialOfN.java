package basicrecursion;

import java.util.Scanner;

public class FactorialOfN {
    static int factOfN(int n){
        if(n == 0)
            return 1;
        return n * factOfN(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(factOfN(n));
    }
}
