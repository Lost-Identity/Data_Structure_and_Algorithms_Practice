package patterns;

import java.util.Scanner;

public class Pattern14 {

    /*
           A
           AB
           ABC
           ABCD
           ABCDE

     */

    public static void printPattern(int n){

        for(int i = 0; i < n; i++){
            for(char ch = 'A'; ch <= 'A' + i; ch++){
                System.out.print(ch);
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
