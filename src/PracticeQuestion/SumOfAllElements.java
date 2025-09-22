package PracticeQuestion;

// Sum of All Elements in an Array
public class SumOfAllElements {  //T.C ==> O(n)
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 9, 1};
        int sum = 0;

        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }

        System.out.println(sum);
    }
}
