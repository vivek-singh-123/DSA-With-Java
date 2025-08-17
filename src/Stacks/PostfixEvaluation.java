package Stacks;

import java.util.Stack;

public class PostfixEvaluation {
    public static void main(String[] args) {
        String postfix = "953+4*6/-";
        Stack<Integer> st=new Stack<>();

        for(int i=0; i<postfix.length(); i++){
            char ch=postfix.charAt(i);

            int ascii=(int)ch;
            if(ascii>=48 && ascii<=57){
                st.push(ascii-48);
            }else {
                int v2=st.pop();
                int v1=st.pop();

                if(ch=='-') st.push(v1-v2);
                if(ch=='+') st.push(v1+v2);
                if(ch=='*') st.push(v1*v2);
                if(ch=='/') st.push(v1/v2);
            }
        }
        System.out.println(st.peek());
    }
}
