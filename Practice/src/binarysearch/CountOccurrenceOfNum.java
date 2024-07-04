package binarysearch;

public class CountOccurrenceOfNum {

    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 3, 3, 3, 4, 4, 5 ,7, 7};
        int x = 7;

        int [] ans = FirstAnnLastOccurrenceUsingBasicBS.findFirstAndLastOccurrence(arr, x);

        if(ans[0] == -1) System.out.println(0);
        System.out.println((ans[1] - ans[0]) + 1) ;

    }


}
