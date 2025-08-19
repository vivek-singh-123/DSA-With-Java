package Stacks;

import java.util.Stack;

public class MultiplicationOfElementsInStack {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(3);
        st.push(7);
        st.push(9);
        st.push(2);
        st.push(5);
        st.push(11);
        st.push(2);
        st.push(8);
        System.out.println(st);

        Stack<Integer> st2=new Stack<>();
        int mult=1;

        while (!st.isEmpty()){
            int popped=st.pop();
            mult=mult*popped;
            st2.push(popped);
        }

        System.out.println("Multiplication of all elements: "+mult);

        while (!st2.isEmpty()){
            int popped= st2.pop();
            st.push(popped);
        }

        System.out.println(st);
    }
}
