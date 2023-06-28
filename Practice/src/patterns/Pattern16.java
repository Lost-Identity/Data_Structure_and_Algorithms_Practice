package patterns;

import java.util.Scanner;

public class Pattern16 {

    /*
          A
          BB
          CCC
          DDDD
          EEEEE
     */

    public static void printPattern(int n){

        for(int i = 0; i < n; i++){
            char ch = (char) ('A' + i);
            for(int j = 0; j < i + 1; j++){
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
