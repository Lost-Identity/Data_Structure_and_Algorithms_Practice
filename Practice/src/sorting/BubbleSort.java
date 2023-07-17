package sorting;

import java.util.Scanner;

public class BubbleSort {

    public static void bubble_sort(int[] arr, int n){

        for(int i = n - 1; i >= 1; i--){

            for(int j = 0; j <= i - 1; j++){

                if(arr[j] > arr[j + 1])
                    swap(arr, j, j + 1);
            }
        }
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        bubble_sort(arr, n);
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }

    }
}
