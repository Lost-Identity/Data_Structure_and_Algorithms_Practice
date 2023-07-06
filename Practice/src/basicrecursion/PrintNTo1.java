package basicrecursion;

import java.util.Scanner;

public class PrintNTo1 {

    public static void printNTo1(int N){

        print(N);
    }
    static void print(int N){
        if(N < 1)
            return;
        System.out.print(N + " ");
        printNTo1(N - 1);
    }


    public static void printNTo1(int i, int N){
        if(i < 1)
            return;
        System.out.print(i + " ");
        printNTo1(i - 1, N);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        printNTo1(N);
        printNTo1(N, N);
    }
}
