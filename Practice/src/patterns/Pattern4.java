package patterns;

import java.util.Scanner;

public class Pattern4 {

    /**
     *  1
     *  22
     *  333
     *  4444
     *  55555
     */

    public static void printPattern(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < i + 1; j++){
                System.out.print(i + 1);
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
