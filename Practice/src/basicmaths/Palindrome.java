package basicmaths;

import java.util.Scanner;

public class Palindrome {

    public static void checkPalindrome(int n){
        int revNum = 0, temp = n;
        while(temp > 0){
            int lastDig = temp % 10;
            revNum = revNum * 10 + lastDig;
            temp /= 10;
        }
        if(revNum == n)
            System.out.println("Yes the given number is a palindrome");
        else
            System.out.println("The given number is not a palindrome");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        checkPalindrome(n);
    }
}
