package binarysearch;

public class BasicBinarySearch {


    // Brute force approach with time complexity O(N)
    public static int findTarget(int[] arr, int n, int target){
        int low = 0;
        int high = n - 1;

        while(high >= low){

            int mid = (low + high) / 2;
            if(arr[mid] == target)
                return mid;
            else if(arr[mid] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }

    public static int findTargetRecursive(int[] arr, int high, int low, int target){

        int mid = (low + high) / 2;

        if(low > high)
            return -1;

        if(arr[mid] == target)
            return mid;
        else if (arr[mid] > target)
            return findTargetRecursive(arr, mid - 1, low, target);
        else
            return findTargetRecursive(arr, high, mid + 1, target);
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 6, 8, 9, 13, 16, 19, 21, 27};
        int n = arr.length;
        int target = 27;
        int high = n - 1;
        int low = 0;

        System.out.println(findTargetRecursive(arr, high, low, target));

        System.out.println(findTarget(arr, n, target));
    }
}
