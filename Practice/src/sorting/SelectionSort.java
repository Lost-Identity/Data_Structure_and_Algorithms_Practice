package sorting;

import java.util.Scanner;

public class SelectionSort {

    public static void selection_sort(int[] arr, int n){

        for(int i = 0; i <= n - 2; i++){
            int min = i;
            for(int j = i; j <= n - 1; j++){
                if(arr[j] < arr[min])
                    min = j;
            }
            swap(arr, min, i);
        }
    }

    public static void swap(int[] arr, int min, int i){
        int temp = arr[i];
        arr[i] = arr[min];
        arr[min] = temp;
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
        selection_sort(arr, n);
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
