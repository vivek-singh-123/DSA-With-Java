package Test1Answer;

import java.util.HashSet;

public class Test7 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("A");
        set.add("B");
        set.add("A");
        System.out.println(set);
    }
}
