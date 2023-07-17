package hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountFrequencyByMap {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter size of input array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Please enter array elements one by one");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        //pre-compute
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
        //iterate in the map
        for(Map.Entry<Integer, Integer> mp : map.entrySet()){

            System.out.println(mp.getKey() + " -> " + mp.getValue());

        }

        System.out.println("Please enter no of queries you want to run");
        int q = sc.nextInt();
        while(q > 0) {
            System.out.println("Please enter the number you want to fetch");
            int num = sc.nextInt();
            //fetch
            System.out.println(map.get(num));
        }
    }
}
