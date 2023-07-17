package hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindHighestAndLowestFreq {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        System.out.println("Enter the array elements one by one");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        
        //pre compute
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            if(map.containsKey(arr[i])){
                int old_freq = map.get(arr[i]);
                int new_freq = old_freq + 1;
                map.put(arr[i], new_freq);
            }
            else
                map.put(arr[i], 1);
        }


        //fetch
        //iterate through map
        int max_freq = 0;
        for(Map.Entry<Integer, Integer> mp : map.entrySet()){

            if(map.get(mp.getKey()) >= max_freq){
                max_freq = mp.getValue();
                System.out.println("maximum frequency element is: " + mp.getKey() + " with frequency: " + max_freq);
            }
            int min_freq = mp.getValue();
            if(min_freq < mp.getValue()){
                System.out.println("minimum frequency element is: " + mp.getKey() + " with frequency: " + min_freq);
            }
        }
    }
}
