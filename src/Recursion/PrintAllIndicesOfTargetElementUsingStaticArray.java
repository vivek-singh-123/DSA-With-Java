package Recursion;

import java.util.Arrays;

public class PrintAllIndicesOfTargetElementUsingStaticArray {
    public static void main(String[] args) {
        int[] arr={2,10,7,15,4,7,5,9,7,18,23,7};
        int target=7;
        int len=arr.length;
        int i=0;
        int j=len-1;
        int[] result=new int[len]; //static array
        int p=0;
        int[] show=printAllIndices(arr, i, j, target, result, p);
        System.out.println(Arrays.toString(show));

    }
    static int[] printAllIndices(int[] arr, int i, int j, int target, int[] result, int p){
        if(i>j){
            return result;
        }
        if(arr[i]==target){
            result[p]=i;
        }
        return printAllIndices(arr, i+1, j, target, result,p+1);
    }
}
