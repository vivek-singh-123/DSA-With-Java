package Test1Practice;

import java.util.ArrayList;
import java.util.List;

public class SlidingWindow {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 5, 4, 6, 7, 8, 9, 10};
        int window=4;
        int len=arr.length;
        List<Integer> list=new ArrayList<>();
        for(int i=0; i<len-window+1; i++){
            int curMax=Integer.MIN_VALUE;
            for(int start=i; start<i+window; start++){
                curMax=Math.max(curMax, arr[start]);

            }
            list.add(curMax);
        }
        System.out.println(list.toString());
    }
}
