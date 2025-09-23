package PracticeQuestion;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// Given two arrays arr1 and arr2, find the intersection(unique) of the arrays — all elements that are present in both arrays.
public class IntersectionOfTwoArrays {  // T.C ==> O(arr1.length + arr2.length) & S.C ==> O(arr1.length + arr2.length)
    public static void main(String[] args) {
        int[] arr1 = {1,2,2,3,5};
        int[] arr2 = {2,2,4,3};
        Set<Integer> st=new HashSet<>();
        Set<Integer> st2=new HashSet<>();

        for(int num:arr1){
            st.add(num);
        }

        for(int num2:arr2){
            st2.add(num2);
        }

        st.retainAll(st2); //keeps only elements present in both arrays
        int i=0;
        int[] result=new int[st.size()];
        for(int a:st){
            result[i] = a;
            i++;
        }
        System.out.println(Arrays.toString(result));
    }
}
