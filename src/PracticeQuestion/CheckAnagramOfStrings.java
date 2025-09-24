package PracticeQuestion;

import java.util.Arrays;
import java.util.HashMap;

//Two strings are anagrams if they contain same characters with same frequency
public class CheckAnagramOfStrings {
    public static void main(String[] args) {
        String s1 = "abcdef";
        String s2 = "deabcf";

        if(s1.length() != s2.length()){
            System.out.println("not anagram");
            return;
        }

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(Arrays.equals(arr1, arr2)){
            System.out.println("anagram");
        }else {
            System.out.println("not anagram");
        }
    }

}
