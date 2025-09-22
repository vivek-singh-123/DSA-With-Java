package PracticeQuestion;
import java.util.Arrays;

// Reverse an Array
public class ReverseAnArray { // T.C ==> O(n)
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int start = 0, end = arr.length-1;

        while (start < end ){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        System.out.println(Arrays.toString(arr));
    }
}
