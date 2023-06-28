package patterns;

import java.util.Scanner;

public class Pattern6 {

    /**
     *   12345
     *   1234
     *   123
     *   12
     *   1
     *
     */

    public static void printPattern(int n){

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n - i; j++){
                System.out.print(j + 1);
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
