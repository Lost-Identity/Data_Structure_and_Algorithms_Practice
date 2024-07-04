package binarysearch;

public class FirstAnnLastOccurrenceUsingBasicBS {

    public static int firstOccurrence(int[] arr, int x){

        int low = 0;
        int first = -1;
        int high = arr.length - 1;

        while(low <= high){

            int mid = (low + high) / 2;
            if(arr[mid] == x){
                first = mid;
                high = mid - 1;
            }
            else if(arr[mid] < x)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return first;
    }

    public static int lastOccurrence(int[] arr, int x){
        int low = 0;
        int last = -1;
        int high = arr.length - 1;

        while(high >= low){

            int mid = (low + high) / 2;
            if(arr[mid] == x){
                last = mid;
                low = mid + 1;
            }
            else if(arr[mid] > x)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return last;
    }

    public static int[] findFirstAndLastOccurrence(int[] arr, int x){
        int[] ans = {-1, -1};
        int first = firstOccurrence(arr, x);
        if(first == -1) return ans;
        ans[0] = first;
        ans[1] = lastOccurrence(arr, x);
        return ans;
    }


    public static void main(String[] args) {

        int[] arr = {2, 4, 6, 8, 8, 8, 11, 13};

        int x = 14;

        int[] ans = findFirstAndLastOccurrence(arr, x);

        System.out.println("first: " + ans[0]);
        System.out.println("last: " + ans[1]);

    }
}
