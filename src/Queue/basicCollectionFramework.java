package Queue;

import java.util.*;

public class basicCollectionFramework {
    public static void main(String[] args) {
       Deque<Integer> q0=new ArrayDeque<>(); //doubly ended queue when needed
                                        //doubly ended queue ke object ko singly ended queue ki tarah treat kiya jaa skta hai

//        Queue<Integer> q1=new PriorityQueue<>();   //when we want to create max heap/min heap/priority queue
//        Queue<Integer> q3=new LinkedList<>();       //jab singly ended queue ka object bnanan hoga tab LL constructor ka use krenge
                                                //is created object me offer and poll use krenge


        Queue<Integer> q=new LinkedList<>(); //queue ko LL ke madad se achieve kr rhe hai
        System.out.println(q.isEmpty());
        q.offer(1);
        System.out.println(q.isEmpty());
        q.offer(2);
        q.offer(3);
        q.offer(4);
        q.offer(5);
        System.out.println(q);
        System.out.println("size: "+q.size());

        q.poll();
        System.out.println(q);
        System.out.println("size: "+q.size());

        q.poll();
        System.out.println(q);
        System.out.println("size: "+q.size());

        System.out.println(q.peek());
        System.out.println(q.element()); //peek() and element are same!

    }
}
