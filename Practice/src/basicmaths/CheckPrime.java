package basicmaths;

import java.util.Scanner;

public class CheckPrime {

    // Brute force approach O(N)
    public static void isPrime(int n){

        int count = 0;
        for(int i = 1; i <= n; i++){
            if(n % i == 0)
                count++;
        }
        if(count == 2)
            System.out.println("Yes the given number is a prime number");
        else
            System.out.println("The given number is not a prime number");
    }

    // optimal approach
    public static void primeCheck(int n){

        int count = 0;
        for(int i = 1; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                count++;
                if(n / i != i)
                    count++;
            }
        }
        if(count == 2)
            System.out.println("Yes the given number is a prime number");
        else
            System.out.println("The given number is not a prime number");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();

//        isPrime(n);
        primeCheck(n);
    }
}
