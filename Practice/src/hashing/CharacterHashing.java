package hashing;


import java.util.Arrays;
import java.util.Scanner;

public class CharacterHashing {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String s = sc.nextLine();

        //pre compute
//        int[] hash = new int[26];
        int[] hash = new int[256];
        Arrays.fill(hash, 0);
        for(int i = 0; i < s.length(); i++){
//            hash[s.charAt(i) - 'a']++;
            hash[s.charAt(i)]++;
        }

        int q = sc.nextInt();
        while(q > 0){
            System.out.println("Enter a char you want to fetch");
            char c = sc.next().charAt(0);

            //fetch
//            System.out.println(hash[c - 'a']);
            System.out.println(hash[c]);
        }
    }
}
