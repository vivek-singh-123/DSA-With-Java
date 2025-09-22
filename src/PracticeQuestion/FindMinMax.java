package PracticeQuestion;

// Find Both Minimum and Maximum in an Array (Single Pass)
public class FindMinMax { // T.C ==> O(n)
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 9, 1};
        int minimum = Integer.MAX_VALUE;
        int maximum = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            minimum = Math.min(minimum, arr[i]);
            maximum = Math.max(maximum, arr[i]);
        }

        System.out.println("Min = "+minimum+", Max = "+maximum);
    }
}
