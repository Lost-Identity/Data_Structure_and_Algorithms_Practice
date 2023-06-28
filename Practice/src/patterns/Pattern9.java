package patterns;

import java.util.Scanner;

public class Pattern9 {

    /**
     *          *
     *         ***
     *        *****
     *       *******
     *      *********
     *      *********
     *       *******
     *        *****
     *         ***
     *          *
     */

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a digit");
        int n = sc.nextInt();
        Pattern7.printPattern(n);
        Pattern8.printPattern(n);
    }
}
