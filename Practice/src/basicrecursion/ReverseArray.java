package basicrecursion;

import java.util.Scanner;

public class ReverseArray {

    public static void reverseArray(int l, int[] arr, int r){

        if(l >=  r){
            return;
        }
        swap(l, arr, r);
        reverseArray(l + 1, arr, r - 1);

    }

    static void swap(int l, int[] arr, int r){
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }

    public static void revArray(int i, int[] arr){
        int n = arr.length;
        if(i > n / 2)
            return;
        swap(i, arr,n - i - 1);
        revArray(i + 1, arr);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){

            arr[i] = sc.nextInt();
        }
        System.out.println("Input array is");

        for(int i = 0; i < n; i++){
            System.out.print( arr[i] + " ");
        }
        System.out.println();

//        reverseArray(0, arr, n - 1);

        revArray(0, arr);

        System.out.println("Output array is");

        for(int i = 0; i < n; i++){
            System.out.print( arr[i] + " ");
        }
    }
}
