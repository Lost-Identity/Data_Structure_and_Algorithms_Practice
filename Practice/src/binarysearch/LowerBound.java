package binarysearch;

public class LowerBound {

    // Smallest index such that arr[ind] >= target
    //time complexity O(logN)
    public static int lowerBound(int[] arr, int target){

        int low = 0;
        int high = arr.length - 1;
        int ans = arr.length;

        while(low <=  high){

            int mid = (low + high)/2;
            if(arr[mid] >= target) {
                ans = mid;
                high = mid - 1;
            }
            else
                low = mid + 1;

        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 8, 15, 19};
        int target = 17;

        System.out.println(lowerBound(arr, target));
    }
}
