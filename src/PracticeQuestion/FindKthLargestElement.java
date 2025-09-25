package PracticeQuestion;

import java.util.PriorityQueue;

//Find kth largest element in an array.
public class FindKthLargestElement {
    public static void main(String[] args) {
        int[] arr = {3,2,1,5,6,4};
        int k = 2;

        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0; i<k; i++){
            pq.add(arr[i]);
        }

        for(int i=k; i< arr.length; i++){
            if(arr[i] > pq.peek()){
                pq.remove();
                pq.add(arr[i]);
            }
        }

        System.out.println(pq.peek());
    }
}
