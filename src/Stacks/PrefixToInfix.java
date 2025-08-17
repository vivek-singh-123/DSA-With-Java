package Stacks;

import java.util.Stack;

public class PrefixToInfix {
    public static void main(String[] args) {
        String preFix="-9/*+5346";
        Stack<String> val=new Stack<>();

        for(int i=preFix.length()-1; i>=0; i--){
            char ch=preFix.charAt(i);

            int ascii=(int)ch;
            if(ascii>=48 && ascii<=57){
                val.push(String.valueOf(ascii-48));
            } else {
                String val1=val.pop();
                String val2=val.pop();
                char op=ch;

                String s="(" + val1 + op + val2 + ")";
                val.push(s);
            }
        }
        System.out.println(val.peek());
    }
}
