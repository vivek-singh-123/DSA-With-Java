package Stacks;

import java.util.Stack;

public class SumOfAllElementInStack {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(2);
        st.push(3);
        st.push(7);
        st.push(11);
        st.push(3);
        st.push(7);
        st.push(2);
        st.push(3);
        st.push(7);
        st.push(2);
        st.push(3);
        st.push(7);
        st.push(11);
        st.push(3);
        st.push(7);

        Stack<Integer> backup=new Stack<>();
        int sum=0;

        while (!st.isEmpty()){
            int popped= st.pop();
            sum=sum+popped;
            backup.push(popped);
        }

        while (!backup.isEmpty()){
            int popped= backup.pop();
            st.push(popped);
        }

        System.out.println("Stack is: "+st);
        System.out.println("Sum of all stack elements is: "+sum);

    }
}
