package Recursion;

import java.util.ArrayList;
import java.util.List;

public class FindFirstLastOccurrence {
    public static void main(String[] args) {
        int[] arr = {7, 16, 9, 7, 34, 15, 8, 7, 33};
        int target = 7;
        int len = arr.length;
        int i = 0;
        int j = len - 1;
        List<Integer> list = new ArrayList<>();
        firstLastOccurrence(arr, target, i, j, list);
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
    }

    static List<Integer> firstLastOccurrence(int[] arr, int target, int i, int j, List<Integer> list) {
        if (i >= j) {
            return list;
        }
        if (target == arr[i]) {
            list.add(i);
        }
        return firstLastOccurrence(arr, target, i + 1, j, list);
    }
}
