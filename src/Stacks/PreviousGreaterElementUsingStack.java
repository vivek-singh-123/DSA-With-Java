package Stacks;

import java.util.Stack;

public class PreviousGreaterElementUsingStack {
    public static int[] preGreaterElement(int[] arr){
        int n = arr.length;
        int[] newArr = new int[n];
        Stack<Integer> st =new Stack<>();

        for(int i=0; i<n; i++){
            while (!st.isEmpty() && st.peek() <= arr[i]){
                st.pop();
            }

            if (st.isEmpty()){
                newArr[i] = -1;
            } else {
                newArr[i] = st.peek();
            }
            st.push(arr[i]);
        }
        return newArr;
    }

    public static void main(String[] args) {
        int[] arr = {100, 80, 60, 70, 60, 75, 85};
        int[] result = preGreaterElement(arr);

        //print
        for(int a: result){
            System.out.print(a+" ");
        }
    }
}
