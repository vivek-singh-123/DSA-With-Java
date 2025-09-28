package PracticeQuestion;

import Heap.PriorityQ;

import java.util.PriorityQueue;

public class KthLargestElement {
    public static void main(String[] args) {
        int[] arr = {2,15,3,11,7,10};
        int k = 3;

        PriorityQueue<Integer> pq=new PriorityQueue<>();  //min heap
        for(int i=0; i<k; i++){
            pq.add(arr[i]);
        }

        for(int i=k; i< arr.length; i++){
            if(arr[i] > pq.peek()){
                pq.poll();
                pq.offer(arr[i]);
            }
        }

        System.out.println(pq.peek());
    }
}
