package Test1Practice;

import java.util.Arrays;

public class CopyArrayToAnotherArray {
    public static void main(String[] args) {
        int[] arr1={10,5,0,55,98,10,2,58,56,36};
        System.out.println(Arrays.toString(arr1));

        int len=arr1.length;
        int[] arr2=new int[len];
        for(int i=0; i<len; i++){
            arr2[i]=arr1[i];
        }

        System.out.println(Arrays.toString(arr2));

    }
}
