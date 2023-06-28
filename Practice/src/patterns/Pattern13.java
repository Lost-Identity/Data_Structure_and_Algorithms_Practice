package patterns;

import java.util.Scanner;

public class Pattern13 {

    /*
         1
         2 3
         4 5 6
         7 8 9 10
         11 12 13 14 15

     */

    public static void printPattern(int n){

        int count = 1;
        for(int i = 1; i <=n; i++){
            for(int j = 0; j < i; j++){
                System.out.print(count + " ");
                count++;
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
