package patterns;

import java.util.Scanner;

public class Pattern17 {

    /*
            A
           ABA
          ABCBA
         ABCDCBA
     */

    public static void printPattern(int n){

        // My approach


//        for(int i = 0; i < n; i++){
//            for(int j = 0; j < n - i - 1; j++){
//                System.out.print(" ");
//            }
//            for(char ch = 'A'; ch <= 'A' + i; ch++){
//                System.out.print(ch);
//            }
//            for(char ch = (char)('A' + i - 1); ch >= 'A'; ch--){
//                System.out.print(ch);
//            }
//            for(int j = 0; j < n - i - 1; j++){
//                System.out.print(" ");
//            }
//            System.out.println();
//        }

        //optimal solution

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n - i - 1; j++){
                System.out.print(" ");
            }

            char ch = 'A';
            int breakPoint = (2 * i + 1)/ 2;
            for(int j = 1; j <= 2 * i + 1; j++){
                System.out.print(ch);
                if(j <= breakPoint) ch++;
                else ch--;
            }

            for(int j = 0; j < n - i - 1; j++){
                System.out.print(" ");
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
