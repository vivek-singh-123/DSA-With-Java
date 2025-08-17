package Stacks;

import java.util.Stack;

public class InfixToPostfix {
    public static void main(String[] args) {
        String infix = "9-(5+3)*4/6";
        Stack<String> num=new Stack<>();
        Stack<Character> op=new Stack<>();

        for(int i=0; i<infix.length(); i++){
            char ch = infix.charAt(i);

            int ascii=(int)ch;

            if(ascii>=48 && ascii<=57){
                num.push(String.valueOf(ch));
            } else if (op.isEmpty() || ch=='(' || op.peek()=='(') {
                op.push(ch);
            } else if (ch==')') {
                while (op.peek()!='('){
                    String v2=num.pop();
                    String v1=num.pop();
                    char o=op.pop();

                    String s= v1+v2+o;
                    num.push(s);
                }
                op.pop();
            } else if (ch=='+' || ch=='-') {
                String v2=num.pop();
                String v1=num.pop();
                char o=op.pop();

                String s=v1+v2+o;
                num.push(s);

                op.push(ch);

            } else if (ch=='*' || ch=='/') {
                if(op.peek()=='*' || op.peek()=='/'){
                    String v2=num.pop();
                    String v1=num.pop();
                    char o=op.pop();

                    String s=v1+v2+o;
                    num.push(s);

                    op.push(ch);
                } else {
                    op.push(ch);
                }
            }
        }

        while (num.size()>1){
            String v2=num.pop();
            String v1=num.pop();
            char o=op.pop();

            String s=v1+v2+o;
            num.push(s);
        }
        System.out.println(num.peek());
    }
}
