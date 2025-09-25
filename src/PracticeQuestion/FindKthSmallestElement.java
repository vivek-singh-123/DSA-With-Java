package PracticeQuestion;

import java.util.Comparator;
import java.util.PriorityQueue;

// Find kth the smallest element in an unsorted array.
public class FindKthSmallestElement {
    public static void main(String[] args) {
        int[] arr = {7,10,4,3,20,15};
        int k = 3;

        PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
        for(int i=0; i<k; i++){
            pq.add(arr[i]);
        }

        for(int i=k; i< arr.length; i++){
            if(arr[i] < pq.peek()){
                pq.remove();
                pq.add(arr[i]);
            }
        }

        System.out.println(pq.peek());
    }
}
