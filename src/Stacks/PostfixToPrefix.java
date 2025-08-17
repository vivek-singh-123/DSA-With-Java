package Stacks;

import java.util.Stack;

public class PostfixToPrefix {
    public static void main(String[] args) {
        String postFix = "953+4*6/-";
        Stack<String> st=new Stack<>();

        for(int i=0; i<postFix.length(); i++){
            char ch=postFix.charAt(i);

            int ascii=(int)ch;
            if(ascii>=48 && ascii<=57){
                st.push(String.valueOf(ascii-48));
            } else {
                String val2=st.pop();
                String val1=st.pop();

                st.push(ch+val1+val2);
            }
        }
        System.out.println(st.peek());
    }
}
