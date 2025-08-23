package Queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class displayQueue {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.add(2);
        q.add(3);
        q.add(5);
        q.add(7);
        q.add(11);

        Queue<Integer> q2=new ArrayDeque<>();
        while (!q.isEmpty()){
            System.out.print(q.peek()+" ");
            q2.add(q.poll());

        }
        System.out.println();

        while (!q2.isEmpty()){
            q.add(q2.poll());
        }
        System.out.println(q);
    }
}
