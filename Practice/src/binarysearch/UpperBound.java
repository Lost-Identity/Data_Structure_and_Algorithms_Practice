package binarysearch;

public class UpperBound {

    public static int upperBound(int[] arr, int target){
        int high = arr.length - 1;
        int low = 0;
        int ans = arr.length;

        while(high >= low){

            int mid = (low + high) / 2;
            if(arr[mid] > target){
                ans = mid;
                high = mid - 1;
            }
            else
                low = mid + 1;
        }
        return ans;
    }

    // smallest index such that arr[ind] > target
    public static void main(String[] args) {
        int[] arr = {2, 3, 6, 7, 8, 8, 11, 11, 11, 12};
        int target = 4;

        System.out.println(upperBound(arr, target));
    }
}
