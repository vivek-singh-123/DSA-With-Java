package Test1Practice;

import java.util.HashSet;
import java.util.Set;

public class HashSetRemoveDuplicates {
    public static void main(String[] args) {
        Set<Integer> hs=new HashSet<>();
        hs.add(10);
        hs.add(15);
        hs.add(30);
        Set<Integer> hs2=new HashSet<>();
        hs2.add(30);
        hs2.add(40);
        hs.add(10);
        hs2.add(30);
        hs2.contains(hs);
        System.out.println(hs2);
    }
}
