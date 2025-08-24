package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class FindMaximumElement {
    public static int findMax(Queue<Integer> queue){
        if(queue.isEmpty()){
            System.out.println("Queue is empty!!!");
            return -1;
        }

        int max=Integer.MIN_VALUE;

        for(int vivek: queue){
            if(vivek>max){
                max=Math.max(max, vivek);
                vivek=max;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>();
        queue.offer(101);
        queue.offer(21);
        queue.offer(699);
        queue.offer(49);
        queue.offer(545);
        System.out.println("Queue: "+queue);


        int result = findMax(queue);
        System.out.println("Max: "+result);
    }
}
