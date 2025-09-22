package PracticeQuestion;

// Find Maximum in an Array
public class FindMaximum {  // T.C ==> O(n)
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 9, 1};
        int max = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            max = Math.max(max, arr[i]);
        }

        System.out.println(max);
    }
}
