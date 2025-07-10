package Recursion;

import java.util.ArrayList;
import java.util.List;

public class PrintAllIndicesOfTargetElementUsingDynamicArray {
    public static void main(String[] args) {
        int[] arr={2,10,7,15,4,7,5,9,7,18,23,7};
        int target=7;
        int len=arr.length;
        int i=0;
        int j=len-1;
        List<Integer> list=new ArrayList<>();
        int p=0;
        List<Integer> show=printAllIndices(arr, i, j, target, list, p);
        System.out.println(show.toString());

    }
    static List<Integer> printAllIndices(int[] arr, int i, int j, int target, List<Integer> list, int p){
        if(i>j){
            return list;
        }
        if(arr[i]==target){
            list.add(i);
        }
        return printAllIndices(arr, i+1, j, target, list,p+1);
    }
}
