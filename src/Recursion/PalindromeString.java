package Recursion;

public class PalindromeString {
    public static void main(String[] args) {
        String str = "racecar";
        int l=0;
        int r=str.length()-1;
        boolean palindrome=CheckStrPalindrome(str, l, r);
        System.out.println(palindrome);

    }

    public static boolean CheckStrPalindrome(String str, int l, int r){
        if(l>=r){
            return true;
        }

        if(str.charAt(l) != str.charAt(r)){
            return false;
        }

        return CheckStrPalindrome(str, l+1, r-1);
    }
}
