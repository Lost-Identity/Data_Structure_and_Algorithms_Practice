package patterns;

import java.util.Scanner;

public class Pattern10 {

    /*
     *
     **
     ***
     ****
     *****
     ****
     ***
     **
     *

     */

    public static void printPattern(int n){

        for(int i = 1; i <= 2 * n - 1; i++){
            int stars = i;
            if(i > n) stars = 2 * n - i;
            for(int j = 1; j <= stars; j++){
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

//        Pattern2.printPattern(n);
//        Pattern5.printPattern(n - 1);
    }
}
