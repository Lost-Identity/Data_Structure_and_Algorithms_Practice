package patterns;

import java.util.Scanner;

public class Pattern5 {

    /**
     *    *****
     *    ****
     *    ***
     *    **
     *    *
     *
     */

    public static void printPattern(int n){

        for(int i = 0; i < n; i++){
            for(int j = n; j > i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a digit");
        int n = sc.nextInt();

        printPattern(n);
    }
}
