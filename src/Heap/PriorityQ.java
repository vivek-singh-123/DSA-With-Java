package Heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQ {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(); //by default min heap
        pq.add(10);
        pq.add(20);
        pq.add(7);
        pq.add(11);
        pq.add(18);
        pq.add(15);

        System.out.println(pq.peek());
        //remove
        pq.remove();
        System.out.println(pq.peek());
        //size
        System.out.println(pq.size());
        //print
                    // This prints the internal heap structure (like the array inside the heap).
                    // It only guarantees the heap property (root is smallest), NOT a sorted array.
        System.out.println(pq);

        while (!pq.isEmpty()){
            // This will give elements in sorted order,
            // because we are repeatedly removing the top (smallest) element.
            System.out.print(pq.peek()+" ");
            pq.poll();
        }

        System.out.println();
        System.out.println("MaxHeap...................");

        PriorityQueue<Integer> maxHeap=new PriorityQueue<>(Collections.reverseOrder());
        maxHeap.add(10);
        maxHeap.add(20);
        maxHeap.add(7);
        maxHeap.add(11);
        maxHeap.add(18);
        maxHeap.add(15);
        //remove
        maxHeap.remove();

        System.out.println(maxHeap.peek()+" ");
        //print
        System.out.println(maxHeap);

        while (!maxHeap.isEmpty()){
            System.out.print(maxHeap.peek()+" ");
            maxHeap.remove();
        }
    }
}
