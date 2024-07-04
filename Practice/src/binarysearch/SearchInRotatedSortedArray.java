package binarysearch;

public class SearchInRotatedSortedArray {

    //brute force approach can be linear search with O(N) time complexity
    //and better approach is binary search with O(logN) time complexity
    public static int searchX(int[] arr, int x){
        int low = 0;
        int high = arr.length - 1;

        while(low <= high){

            int mid = (low + high) / 2;

            if(arr[mid] == x) return mid;

            //left half sorted
            if(arr[low] <= arr[mid]){
                if(arr[low] <= x && arr[mid] >= x)
                    high = mid - 1;
                else
                    low = mid + 1;
            }
            else{
                if(arr[mid] <= x && arr[high] >= x)
                    low = mid + 1;
                else
                    high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {7, 8, 9, 1, 2, 3, 4, 5, 6};
        int x = 1;

        System.out.println(searchX(arr, x));
    }
}
