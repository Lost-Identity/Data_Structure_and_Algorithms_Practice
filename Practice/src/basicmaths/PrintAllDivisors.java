package basicmaths;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintAllDivisors {

    // O(n)
    public static void printAllDivisors(int n){

        for(int i = 1; i <= n; i++){
            if(n % i == 0)
                System.out.print(i + " ");
        }
        System.out.println();
    }

    // sqrt(n)
//    public static void printAllDiv(int n){
//
//        for(int i = 1; i <= Math.sqrt(n); i++){
//            if(n % i == 0){
//                System.out.print(i + " ");
//                if( n / i != i)
//                    System.out.print(n / i + " ");
//            }
//
//        }
//        System.out.println();
//
//    }

    public static int printAllDiv(int n){

        int sum = 0;
        for(int i = 1; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                sum += i;
                if( n / i != i)
                    sum += n / i;
            }

        }
        return sum;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();

        printAllDivisors(n);
        System.out.println(printAllDiv(n));
    }
}
