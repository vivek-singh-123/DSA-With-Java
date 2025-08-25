package Queue;

import java.util.Deque;
import java.util.LinkedList;

public class CFOfDeque {
    public static void main(String[] args) {
        Deque<Integer> dq=new LinkedList<>();
//        dq.addLast(1);
//        dq.addLast(2);
//        dq.addLast(3);
//        dq.addLast(4);
//        System.out.println(dq);
//        dq.addFirst(5);
//        System.out.println(dq);
//        dq.removeLast();
//        System.out.println(dq);
//        dq.removeFirst();
//        System.out.println(dq);
//        System.out.println(dq.getFirst());
//        System.out.println(dq.getLast());

        dq.addLast(1);
        dq.addLast(2);
        dq.addLast(1);
        dq.addLast(1);
        dq.add(5);  //add from last
//        dq.remove();  //remove from first
//        dq.removeAll(dq);    //it will remove all data from queue
        System.out.println(dq);

//        dq.removeFirstOccurrence(1);  //remove first 1
//        System.out.println(dq);

        dq.removeLastOccurrence(1);  //remove last 1
        System.out.println(dq);

    }
}
