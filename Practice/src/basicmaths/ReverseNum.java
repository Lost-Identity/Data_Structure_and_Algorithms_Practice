package basicmaths;

import java.util.Scanner;

public class ReverseNum {

    public static int reverseNum(int n){
        int num = 0;
        while(n > 0){
            int lastDigit = n % 10;
            num = num * 10 + lastDigit;
            n /= 10;
        }
        return num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();
        System.out.println(reverseNum(n));
    }
}
