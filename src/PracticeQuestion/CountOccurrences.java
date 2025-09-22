package PracticeQuestion;

// Count Occurrences of an Element in an Array
public class CountOccurrences {  // T.C ==> O(n)
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 3, 1, 3};
        int x = 3;
        int counter = 0;

        for(int i=0; i<arr.length; i++){
            if(arr[i] == x) counter++;
        }

        System.out.println(counter);
    }
}
