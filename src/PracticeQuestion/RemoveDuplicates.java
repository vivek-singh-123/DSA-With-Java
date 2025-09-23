package PracticeQuestion;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// Remove Duplicates from a Sorted Array
public class RemoveDuplicates {  // T.C ==> O(n)
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 4, 4, 5};
//        Set<Integer> st=new HashSet<>();
//        for(int a: arr){
//            st.add(a);
//        }
//
//        System.out.println(st.size());

        int j=0; //keep maintain unique element index
        for(int i=1; i< arr.length; i++){
            if(arr[i] != arr[j]){
                j++;
                arr[j] = arr[i];
            }
        }

        int newLength = j+1;
        for(int i=0; i<newLength; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        System.out.println(newLength);
    }
}
