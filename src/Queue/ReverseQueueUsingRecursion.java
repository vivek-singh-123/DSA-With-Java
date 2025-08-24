package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class ReverseQueueUsingRecursion {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.offer(40);
        q.offer(50);
        System.out.println("org queue: "+q);

        reverseR(q);
        System.out.println("after reverse: "+q);
    }

    public static void reverseR(Queue<Integer> q){
        if(q.isEmpty()){
            return;
        }

        int x=q.poll();

        reverseR(q);
        q.offer(x);
    }
}
