package Stacks;

import java.util.Stack;

public class InfixToPrefix {
    public static void main(String[] args) {
        String str = "9-(5+3)*4/6";
        Stack<String> numbers =new Stack<>();
        Stack<Character> operator =new Stack<>();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            int ascii = (int)ch;
            if(ascii>=48 && ascii<=57){
                numbers.push(String.valueOf(ch));
            } else if (operator.isEmpty() || operator.peek()=='(' || ch == '(') {
                operator.push(ch);
            } else if (ch==')') {
                while (operator.peek()!='('){
                    String v2=numbers.pop();
                    String v1=numbers.pop();
                    char op=operator.pop();

                    String s =op+v1+v2;
                    numbers.push(s);
                }
                operator.pop();
            } else if (ch=='+' || ch=='-'){
                String v2=numbers.pop();
                String v1=numbers.pop();
                char op=operator.pop();

                String s = op+v1+v2;
                numbers.push(s);

                operator.push(ch);

            } else if (ch=='*' || ch=='/') {
                if(operator.peek()=='*' || operator.peek()=='/'){
                    String v2=numbers.pop();
                    String v1=numbers.pop();
                    char op=operator.pop();

                    String s =op+v1+v2;
                    numbers.push(s);

                    operator.push(ch);
                }else {
                    operator.push(ch);
                }
            }
        }
        while (numbers.size() > 1){
            String v2=numbers.pop();
            String v1=numbers.pop();
            char op=operator.pop();

            String s =op+v1+v2;
            numbers.push(s);
        }

        System.out.println(numbers.peek());
    }
}
