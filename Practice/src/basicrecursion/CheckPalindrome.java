package basicrecursion;

public class CheckPalindrome {

    public static boolean checkPalindrome(int i, String s){

        int n = s.length();
        if(i > n / 2)
            return true;
        if(s.charAt(i) != s.charAt(n - i - 1)){

            return false;
        }

        return checkPalindrome(i + 1, s);
    }

    public static void main(String[] args) {
        String s = "madamm";
        System.out.println(checkPalindrome(0, s));
    }
}
