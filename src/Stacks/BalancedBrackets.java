package Stacks;

import java.util.Stack;

public class BalancedBrackets {
    public static boolean isBalanced(String str){
        Stack<Character> st =new Stack<>();

        int n = str.length();

        for(int i=0; i<n; i++){
            char ch = str.charAt(i);
            if (ch == '('){
                st.push(ch);
            } else if (ch == ')'){
                if(st.isEmpty()){
                    return false;
                } else {
                    if(st.peek() == '('){
                        st.pop();
                    }
                }
            }
        }

        return st.isEmpty();
    }

    public static void main(String[] args) {
        String str = "()(())()()((()))";

        System.out.println(isBalanced(str));
    }
}
