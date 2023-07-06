package basicrecursion;

import java.util.Scanner;

public class SumOfNNums {

    static int sumOfN(int n){
        if(n == 0)
            return 0;
        return n + sumOfN(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumOfN(n));
    }
}
