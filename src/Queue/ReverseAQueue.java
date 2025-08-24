package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseAQueue {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.offer(2);
        q.offer(3);
        q.offer(5);
        q.offer(7);
        q.offer(11);

        System.out.print("Org: "+q+" ");

        Stack<Integer> st=new Stack<>();

        while (!q.isEmpty()){
            st.push(q.poll());
        }

        while (!st.empty()){
            q.offer(st.pop());
        }
        System.out.println();

        System.out.println("reversed: "+q+" ");

    }
}
