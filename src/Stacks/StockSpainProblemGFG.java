package Stacks;

import java.util.Stack;

public class StockSpainProblemGFG {
    public static int[] stockSpain(int[] arr){
        int n = arr.length;
        int[] res =new int[n];
        Stack<Integer> st =new Stack<>();

        for(int i=0; i<n; i++){
            while (!st.isEmpty() && arr[st.peek()] <= arr[i]){
                st.pop();
            }

            if (st.isEmpty()){
                res[i] = i + 1;
            }else {
                res[i] = i-st.peek();
            }
            st.push(i);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {100, 80, 60, 70, 60, 75, 85};
        int result[] = stockSpain(arr);

        //print
        for (int a: result){
            System.out.print(a+" ");
        }
    }
}
