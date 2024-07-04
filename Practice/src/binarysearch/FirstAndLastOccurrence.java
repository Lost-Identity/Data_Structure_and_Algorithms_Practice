package binarysearch;

public class FirstAndLastOccurrence {

    // time complexity O(N)
    public static int[] findFirstAndLastIndex(int[] arr, int x){

        int first = -1;
        int last = -1;
        int[] ans = new int[2];

        for(int i = 0; i < arr.length; i++){

            if(arr[i] == x){
                if(first == -1){
                    first = i;
                    ans[0] = first;
                }
                last = i;
                ans[1] = last;
            }
        }
        return ans;
    }

    // time complexity O(logN) space O(1)
    public static int lowerBound(int[] arr, int x){

        int high = arr.length - 1;
        int low = 0;
        int ans = arr.length;

        while(low <= high){

            int mid = (low + high) / 2;
            if(arr[mid] >= x){
                ans = mid;
                high = mid - 1;
            }
            else
                low = mid + 1;
        }
        return ans;
    }

    // time complexity O(logN) space O(1)
    public static int upperBound(int[] arr, int x){

        int high = arr.length - 1;
        int low = 0;
        int ans = arr.length;

        while(high >= low){

            int mid = (low + high) / 2;

            if(arr[mid] > x){
                ans = mid;
                high = mid - 1;

            }
            else
                low = mid + 1;
        }
        return ans;
    }


    // time complexity 2 * O(logN) space O(1)
    public static int[] findFirstAndLast(int[] arr, int x){
        int[] ans = new int[2];

        int lb = lowerBound(arr, x);
        if(lb == arr.length || arr[lb] != x){
            ans[0] = -1;
            ans[1] = -1;
        }
        ans[0] = lb;
        ans[1] = upperBound(arr, x) - 1;
        return ans;
    }

    public static void main(String[] args) {

        int[] arr = {2, 4, 6, 8, 8, 8, 11, 13};
        int x = 8;

        int[] ans = findFirstAndLastIndex(arr, x);

        System.out.println("first Occurrence: " + ans[0]);
        System.out.println("last Occurrence: " + ans[1]);

        int[] ans1 = findFirstAndLast(arr, x);

        System.out.println("first Occurrence: " + ans1[0]);
        System.out.println("last Occurrence: " + ans1[1]);


    }
}
