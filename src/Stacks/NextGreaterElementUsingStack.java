package Stacks;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElementUsingStack {
    public static int[] greaterElement(int[] arr){
        int n = arr.length;
        int[] res = new int[n];
        Stack<Integer> st =new Stack<>();

        for(int i=n-1; i>=0; i--){
            while (!st.isEmpty() && st.peek() <= arr[i]){
                st.pop();
            }

            if (st.isEmpty()){
                res[i] = -1;
            }else {
                res[i] = st.peek();
            }
            st.push(arr[i]);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {2,7,4,8,1,3,6,10,5};
        int[] result = greaterElement(arr);

        //print
        System.out.println(Arrays.toString(result));
    }
}
