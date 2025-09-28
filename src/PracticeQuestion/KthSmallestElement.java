package PracticeQuestion;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallestElement {
    public static void main(String[] args) {
        int[] arr = {2,15,3,11,7,10};
        int k = 3;

        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());  //max heap
        for(int i=0; i<k; i++){
            pq.add(arr[i]);
        }

        for(int i=k; i< arr.length; i++){
            if(arr[i] < pq.peek()){
                pq.poll();
                pq.offer(arr[i]);
            }
        }

        System.out.println(pq.peek());
    }
}
