package basicmaths;

import java.util.Scanner;

public class CountDigitsII {

    // Given a num N. Count the number of digits in N
    // which evenly divides N.
    // ex: input= 12, o/p = 2 (1, 2 both divide 12 evenly)

    public static int countDigit(int n){

        int N = n;
        int count = 0;
        while(n > 0){
            int lastDig = n % 10;
            if(lastDig != 0 && N % lastDig == 0)
                count++;
            n /= 10;
        }
        return count;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a digit");
        int n = sc.nextInt();
        System.out.println(countDigit(n));
    }
}
