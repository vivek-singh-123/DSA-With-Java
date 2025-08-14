package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class MinRemovalsToBalanceBrackets {
    public static int findMinRemovals(String brackets){
        Stack<Character> st =new Stack<>();
        int n = brackets.length();
        int count = 0;

        for (int i=0; i<n; i++){
            char ch = brackets.charAt(i);
            if (ch == '('){
                st.push(ch);
            } else if (ch == ')') {
                if (!st.isEmpty() && st.peek() == '('){
                    st.pop();
                } else {
                   count++;
                }
            }
        }
        count = count + st.size();
        return count;
    }

    public static void main(String[] args) {
        System.out.println("Plz enter brackets: ");
        String brackets;
        Scanner sc =new Scanner(System.in);
        brackets = sc.next();

        //print
        int result =  findMinRemovals(brackets);
        System.out.println(result);

    }
}
