package basicmaths;

import java.util.Scanner;

public class GcdOrHcf {

    // brute force approach with O(n1 or n2)
    public static int getGCD(int n1, int n2){

        int gcd = 1;
        for(int i = 1; i <= n1; i++){
            if(n1 % i == 0 && n2 % i == 0){
                gcd = i;

            }
        }
        return gcd;
    }


    // Optimal approach
    public static int calGCD(int n1, int n2){
        int gcd = 1;
        for(int i = Math.min(n1, n2); i >= 1; i--){
            if(n1 % i == 0 && n2 % i == 0){
                gcd = i;
                break;
            }
        }
        return gcd;
    }

    // Euclidean algorithm GCD(a, b) = GCD(a - b, b) orr GCD(a, b) = GCD(a % b, b)
    public static int gcd(int n1, int n2){
        while (n1 > 0 && n2 > 0){
            if(n1 > n2) n1 = n1 % n2;
            else n2 = n2 % n1;
        }
        if(n1 == 0) return n2;
        else return n1;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number n1");
        int n1 = sc.nextInt();
        System.out.println("Enter a number n2");
        int n2 = sc.nextInt();

//        System.out.println(getGCD(n1, n2));
//        System.out.println(calGCD(n1, n2));
        System.out.println(gcd(n1, n2));
    }


}
