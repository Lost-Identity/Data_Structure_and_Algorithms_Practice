package hashing;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class CountFrequency {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter size of input array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Please enter array elements one by one");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        //precompute
        int[] hash = new int[13];
        Arrays.fill(hash, 0);
        for(int i = 0; i < n; i++){
            hash[arr[i]] += 1;
        }

        System.out.println("Please enter no of queries you want to run");
        int q = sc.nextInt();
        while(q > 0){
            System.out.println("Please enter the number you want to fetch");
            int num = sc.nextInt();
            //fetch
            System.out.println(hash[num]);
        }

    }
}
