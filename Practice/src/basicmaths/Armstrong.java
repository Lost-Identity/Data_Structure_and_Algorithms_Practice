package basicmaths;

import java.util.Scanner;

public class Armstrong {

    // 371

    public static void isArmstrong(int n){

         int sum = 0, temp = n;
         while(temp > 0){
             int lastDig = temp % 10;
             sum = sum + (lastDig * lastDig * lastDig);
             temp /= 10;
         }
         if(sum == n)
             System.out.println("Yes the given number is a Armstrong number");
         else
             System.out.println("The given number is not a Armstrong number");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();

        isArmstrong(n);
    }
}
