package binarysearch;

public class SearchInRotatedSortedArrayWithDuplicates {

    public static boolean searchInRotatedSortedArray(int[] arr, int k){
        int n = arr.length;
        int low = 0, high = n - 1;

        while(low <= high){

            int mid = (low + high) / 2;

            //if mid points to the target
            if(arr[mid] == k) return true;

            //edge case
            if(arr[low] == arr[mid] && arr[mid] == arr[high]){
                low += 1;
                high -= 1;
                continue;
            }

            //if the left half sorted
            if(arr[low] <= arr[mid]){
                if(arr[low] <= k && arr[mid] <= k){
                    // element exists
                    high = mid - 1;
                }
                else
                    // elements does not exist
                    low = mid + 1;
            }
            //if right half is sorted
            else{
                // if right half is sorted
                if(arr[mid] <= k && arr[high] >= k)
                    //elements exists
                    low = mid + 1;
                else
                    // element does not exist
                    high = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {7, 8, 1, 2, 3, 3, 3, 3, 4, 5, 6};
        int k = 3;
        boolean ans = searchInRotatedSortedArray(arr, k);
        if(ans == false)
            System.out.println("Target is not present");
        else
            System.out.println("Target is present in the array");
    }
}
