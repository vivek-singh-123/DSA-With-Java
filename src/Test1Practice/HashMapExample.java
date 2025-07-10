package Test1Practice;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<Integer, String> student=new HashMap<>();
        student.put(101, "vivek");
        student.put(102, "prince");
        student.put(103, "abhishek");

        System.out.println(student);

    }
}
