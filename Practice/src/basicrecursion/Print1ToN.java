package basicrecursion;

import java.util.Scanner;

public class Print1ToN {

    public static void print(int i, int N){
        if(i > N)
            return;
        System.out.print(i + " ");
        print(i + 1, N);
    }

    public static void print1ToN(int N){

        print(N);
    }
    static void print(int N){
        if(N == 1){
            System.out.print( N + " ");
            return;
        }
        print1ToN(N - 1);
        System.out.print(N + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        print1ToN(N);

        print(1, N);

    }


}
