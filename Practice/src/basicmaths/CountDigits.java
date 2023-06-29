package basicmaths;

import java.util.Scanner;

public class CountDigits {

    // count digits in a number
    public static int countDigits(int n){
        int count = 0;
        while(n > 0){
            int lastDigit = n % 10;
            count += 1;
            n /= 10;
        }
        return count;

    }

    // print digits in a number in rev order
    public static void printDigits(int n){
        while(n > 0){
            int lastDigit = n % 10;
            System.out.print(lastDigit + " ");
            n /= 10;
        }
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a digit");
        int n = sc.nextInt();

        System.out.println(countDigits(n));
        printDigits(n);
    }
}
