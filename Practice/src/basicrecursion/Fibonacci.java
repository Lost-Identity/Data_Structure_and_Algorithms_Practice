package basicrecursion;

import java.util.Scanner;

public class Fibonacci {

    public static int nThFibonacci(int n){

        if(n <= 1)
            return n;
        return nThFibonacci(n - 1) + nThFibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(nThFibonacci(n));
    }
}
