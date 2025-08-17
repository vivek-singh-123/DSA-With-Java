package Stacks;

import java.util.Stack;

public class PostfixToInfix {
    public static void main(String[] args) {
        String postFix="953+4*6/-";
        Stack<String> val=new Stack<>();

        for(int i=0; i<postFix.length(); i++){
            char ch=postFix.charAt(i);
            int ascii=(int)ch;

            if (ascii>=48 && ascii<=57){
                val.push(String.valueOf(ascii-48));
            }else {
                String val2=val.pop();
                String val1=val.pop();
                char op=ch;

                String s='(' + val1 + op + val2 + ')';
                val.push(s);
            }
        }
        System.out.println(val.peek());
    }
}
