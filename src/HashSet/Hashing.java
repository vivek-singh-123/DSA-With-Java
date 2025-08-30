package HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class Hashing {
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();
        //insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(1);

        //print all elements
        System.out.println(set);

        //delete
        set.remove(1);
        if(!set.contains(1)){
            System.out.println("We have deleted 1");
        }

        //size
        System.out.println("size of set is: "+set.size());

        //Iterator
        Iterator it=set.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
