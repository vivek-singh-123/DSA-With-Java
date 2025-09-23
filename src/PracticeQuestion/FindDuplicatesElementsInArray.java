package PracticeQuestion;

import java.util.HashSet;
import java.util.Set;

// Find Duplicate Elements in an Array
public class FindDuplicatesElementsInArray {
    public static void main(String[] args) {  // T.C ==> O(n)
        int[] arr = {1, 2, 3, 2, 4, 1, 5};
        Set<Integer> st=new HashSet<>();

        for(int a : arr){
            if(st.contains(a)){
                System.out.print(a+" ");
            }
            st.add(a);
        }

    }
}
