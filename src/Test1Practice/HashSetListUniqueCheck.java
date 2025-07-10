package Test1Practice;

import java.util.HashSet;
import java.util.Set;

public class HashSetListUniqueCheck {
    public static void main(String[] args) {
        Set<Integer> hs=new HashSet<>();
        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(20);

        System.out.println(hs);
        System.out.println(hs.isEmpty());
        System.out.println(hs.size());
    }
}
