package Stacks;

import java.util.Stack;

public class CountTotalNoOfElementsInStack {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(11);
        st.push(21);
        st.push(5);
        st.push(10);
        st.push(3);
        st.push(21);
        st.push(5);
        st.push(10);
        st.push(11);
        st.push(21);
        st.push(5);
        st.push(10);
        st.push(21);
        st.push(5);
        st.push(10);
        st.push(3);

        Stack<Integer> st2=new Stack<>();
        int count=0;

        while (!st.isEmpty()){
            int popped=st.pop();
            count++;
            st2.push(popped);
        }

        while (!st2.isEmpty()){
            int popped= st2.pop();
            st.push(popped);
        }

        System.out.println("Original stack: "+st);
        System.out.println("Total number of stack are: "+count);
    }
}
