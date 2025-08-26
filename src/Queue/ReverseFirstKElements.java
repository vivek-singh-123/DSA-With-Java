package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseFirstKElements {
    public static void reverseKthElement(Queue<Integer> q, int k){
        if(q.isEmpty()){
            System.out.println("Queue is empty!");
            return;
        }

        Stack<Integer> st=new Stack<>();

        for(int i=0; i<k; i++){
            st.push(q.poll());
        }

        while(!st.isEmpty()){
            q.offer(st.pop());
        }

        int size=q.size();
        for(int i=0; i<size-k; i++){
            q.offer(q.poll());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.offer(4);
        q.offer(5);
        q.offer(6);
        q.offer(7);
        System.out.println(q);
        reverseKthElement(q,4);
        System.out.println(q);

    }
}
