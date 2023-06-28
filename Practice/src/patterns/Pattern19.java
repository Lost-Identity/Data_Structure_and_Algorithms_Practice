package patterns;

import java.util.Scanner;

public class Pattern19 {

    /*
             **********
             ****  ****
             ***    ***
             **      **
             *        *
             *        *
             **      **
             ***    ***
             ****  ****
             **********


     */

    public static void printPattern(int n){
        int iniSpace = 0;
        for(int i = 0; i < n; i++){

            //stars
            for(int j = 1; j <= n - i; j++){
                System.out.print("*");
            }
            //spaces
            for(int j = 0; j <iniSpace; j++){
                System.out.print(" ");
            }
            //stars
            for(int j = 1; j <= n - i; j++){
                System.out.print("*");
            }
            System.out.println();
            iniSpace += 2;
        }

        iniSpace = 2 * n - 2;
        for(int i = 1; i <= n; i++){

            //stars
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            //spaces
            for(int j = 0; j <iniSpace; j++){
                System.out.print(" ");
            }
            //stars
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
            iniSpace -= 2;
        }

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a digit");
        int n = sc.nextInt();

        printPattern(n);
    }
}
