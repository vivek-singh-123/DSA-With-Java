package Recursion;

import java.util.Arrays;

public class StringArrayReverse {
    public static void main(String[] args) {
        String[] str={"apple", "banana", "greps", "orange", "lemon"};
        int len=str.length;
        int start=0;
        int end=len-1;

        stringReverse(str, start, end);
        System.out.println(Arrays.toString(str));

    }
    static void stringReverse(String[] str, int start, int end){
        if(start>end){
            return;
        }
        String temp=str[start];
        str[start]=str[end];
        str[end]=temp;
        stringReverse(str, start+1, end-1);
    }
}
