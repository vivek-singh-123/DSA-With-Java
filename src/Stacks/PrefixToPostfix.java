package Stacks;

import java.util.Stack;

public class PrefixToPostfix {
    public static void main(String[] args) {
        String str = "-9/*+5346";
        Stack<String> st=new Stack<>();

        for(int i=str.length()-1; i>=0; i--){
            char ch=str.charAt(i);

            int ascii=(int)ch;
            if(ascii>=48 && ascii<=57){
                st.push(String.valueOf(ascii-48));
            } else {
                String val1=st.pop();
                String val2=st.pop();
                char op=ch;

                String s=val1+val2+op;
                st.push(s);
            }
        }
        System.out.println(st.peek());
    }
}
