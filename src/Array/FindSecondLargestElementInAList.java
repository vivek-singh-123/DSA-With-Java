package Array;

import java.util.ArrayList;
import java.util.Collections;


public class FindSecondLargestElementInAList {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(17);
        list.add(23);
        list.add(8);
        list.add(50);
        list.add(99);

        Collections.sort(list);
        System.out.println(list.get(list.size()-2));
    }
}
