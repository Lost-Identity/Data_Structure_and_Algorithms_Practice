package binarysearch;

public class FloorAndCeil {

    // floor = largest num in array such that  num <= x
    // Ceil = smallest num in array such that num >= x

    public static int findFloor(int[] arr, int x){

        int high = arr.length - 1;
        int low = 0;
        int ans = -1;

        while(high >= low){

            int mid = (low + high) / 2;
            if(arr[mid] <= x) {
                ans = arr[mid];
                low = mid + 1;
            }
            else
                high = mid - 1;
        }
        return ans;
    }

    public static int findCeil(int[] arr, int x){

        int high = arr.length - 1;
        int low = 0;
        int ans = -1;

        while(low <= high){

            int mid = (low + high) / 2;
            if(arr[mid] >= x){
                ans = arr[mid];
                high = mid - 1;
            }
            else
                low = mid + 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int x = 25;

        System.out.println(findFloor(arr, x));

        System.out.println(findCeil(arr, x));
    }
}
