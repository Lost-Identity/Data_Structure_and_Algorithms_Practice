package patterns;

import java.util.Scanner;

public class Pattern12 {

    /*
         1      1
         12    21
         123  321
         12344321
     */

    public static void printPattern(int n){

        int space = 2 * (n - 1);
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            for(int j = 1; j <= space; j++){
                System.out.print(" ");
            }
            for(int j = i; j >= 1; j--){
                System.out.print(j);
            }
            System.out.println();
            space -= 2;
        }
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a digit");
        int n = sc.nextInt();
        printPattern(n);

    }
}
