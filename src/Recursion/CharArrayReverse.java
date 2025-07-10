package Recursion;

public class CharArrayReverse {
    public static void main(String[] args) {
        char[] ctr={'v', 'i', 'v', 'e', 'k'};
        int len=ctr.length;
        int start=0;
        int end=len-1;
       // char temp=;
    }
    static void reverseCharArray(char[] ctr, int start, int end, char temp){
        if(start>end){
            return;
        }
        temp=ctr[start];
        ctr[start]=ctr[end];
        ctr[end]=temp;
    }
}
