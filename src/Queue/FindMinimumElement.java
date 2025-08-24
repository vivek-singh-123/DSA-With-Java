package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class FindMinimumElement {
    public static int findMin(Queue<Integer> q){
        if(q.isEmpty()){
            System.out.println("Queue is empty!");
            return -1;
        }

        int min = Integer.MAX_VALUE;
        for(int val: q){
            if(val<min){
                min=val;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.offer(21);
        q.offer(35);
        q.offer(29);
        q.offer(-1);
        q.offer(60);
        q.offer(45);
        System.out.print("Queue: "+q);
        System.out.println();
        int r = findMin(q);
        System.out.println("Minimum element: "+r);
    }
}
